package de.appwerft.signinwith;

import java.util.Collections;
import java.util.Map;
import java.util.HashMap;
import java.nio.CharBuffer;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.lang.reflect.Method;
import java.lang.System;
import org.appcelerator.kroll.util.KrollAssetHelper;
import org.appcelerator.kroll.common.Log;
import org.appcelerator.titanium.TiApplication;
import android.os.Debug;

public class AssetCryptImpl implements KrollAssetHelper.AssetCrypt
{
  private static class Range {
    int offset;
    int length;
    public Range(int offset, int length) {
      this.offset = offset;
      this.length = length;
    }
  }

	private static final byte[] assetsBytes = Charset.forName("ISO-8859-1").encode(initAssetsBytes()).array();
	private static CharBuffer initAssetsBytes() {
		CharBuffer buffer = CharBuffer.allocate(7723);
		buffer.append("VZ\2607\337A\033\310\231\233\326\344\026\345\031\005\207\177c\317\204\211\303Z\024}X\221\302o)\361S`\217\324\215^3\315aF\274`\327at\207_R\331o\221\370\0332_\037\207\012\037<\021a\333\215\270\200\021\321Y\321\227\334\232\352\346\350\214\210\231\343\311\034:\035\033\017\\\315\364\316\276\321\260E~\310L\251\321\256l\015\030vu\306\270\360\350\275v\021$\362E\255S\300o\202\234\273\3742\236\2743XM\347\275{\026\300\373\2532\3126\204\002\312\331\335X\357\261F\326&\221\2413\2040\330v\334\253\247\026\2703@\255D\217\327U\246\213crD\326\374k\204\012\2304h\205\334k7-^>]\370zw\361\274\344|\236\227\340\013\243\252\026\\-\356O\002|\006\2749O.kK3\254\013!\253(\224-$\324\177U\377\200\373\340\246]\325\351\347\343\226\340\350\035\257\246\213\211\277\215M\345]_\375v9\201\271\007\036\326qc\0007\026\340G\2716\300HHU::\276O\227\221Dg:\204\313\265\372\351\356\355,\256\363\205\015\372\370\255\255\006\245\234\036\367\261g\242`\020o\273/#\363\246\021\360_A\013@.\302M\263G\346\204;~\016-b\206f\335\337\026\016;-|\253\001B\341Q|gtE\261\344J\270\354\312\373\337\3126\024\322&$\006p\245JA,u\227\251\306+}5\212\2606\255\227\244\204\247:E\006\340\264\255\307;\254\275\271\237\350\241\274\234G G\006\211*\034t\3630+\355\310U\016\233K\363_\206\233\264\304^h\317\304\267\376\364U\207\\\342PD\365\330\225\244\020{\327\340\343Md\363;K\223\244\363p\325\215\362\276\301\030\214\261\003\337\230\347\267\311\354\3410\313\234f\317\2722\030\230\201\225\345\300s\301\036y\023C\205\316\2352\265\014LW\344\256\253\016\322\226g\320\374\240\363 r2_\345v\362\212qF)D\221\004U\270\304\2506\231\004\250\231g\002?/5\327b.6\256\324<\313\244\236\006Vs\245\355\212\305\033\314r\360Dr\213\037\231GH*\275\307)\372oB\014\177\273\324\330\301\304]\330b@H\272\213I\220\226\356?\0127u\215\252\007\031\235\026\333\3721y\303\372Ze;\264J%0\373E\264N\0346\223\2044\032,\032\357iE\177r\335\246>\260u\264\\X\036\"\2549\204G\351\313SzcO\273\267\367N\233%H\242\203\016\317u\306\"I\302\236\266?\177L\326\243OCQ\342+\213I\037\307c\003b\202j\017\343\315J\257\34419.oC)%\221\346\0267j\347\230\326k\357*{\310)\262\012\232\257\312\322\021\202\224\312\337\270\224\235\334\017v\360{v\036'\254\244\363\365\030\354K\023\260`\247p\317\247\202\355\005!^^>\262\336\235b6Q\332\017\015\372JR\264\242@\301_\271\334\333\232\003uL\265\004\231](\213\313\304\243\015s'\263\273\253\313v_c\262\300\025F\224\002\024\314\221\352\002\005\205\257,\234{\306\332\3757\031\206k\331\015\364\332]1\344\217Z\302\025b\206\310\222\204\204+\305pK\303-P\215|\220a\354\0326\263\221<\010\016\275\350\265\257a\377\345\013\030\200\024c\230\311e\233syFzM\306\275I\300_\361\232\3031\3777,\265\273\315HWE\327'\351\330\310}J0\017\311\227\237\203s\3169xm\317\352\022,x\237Z\301\207\012\354[\377\332\200\365\273\217\364N\205bW\313\206W\311}9\340-\"\035\347\272q;\224\327\362\206`\215Q-\202/\272\351\206C\201\306Cgl9C\372e\305_A\250\034D_Z\214\301\362)\265Ac2\377\332\231\007\320\231\0125\260j\250>\262r\014g#\033| u\232\300Xl\273\205}\360\014\231\232\374\325h\016\007\243SB*\371\252\010\017\3754\000~\273\261\201\220\311\373Cy\014\373\336\026\310\251?\023\233\276\247E(D\037\203\227\207\033o\235\254\025\332\015\234@7?\345\337\005\341\267\262\031\363iA\317\234\012\026\021!\227I\223K\251\231\227\037a\361\210\371\303\307\300\225\020\243\241\000h\025\327\3227F!\216\322\341\265~X\177>\014\214\363\276\306\373\\\201|\027\352\304y\0067\203|\230L\257\243\342\211Yj\005\371\217@L\332>]\354\330\016\241UN7\361g\270\2241-u\211\257 \226t\201'\243_o:\240%GD\255\312\243\032\277/4A\205\262\006k\227\350@\360\245\372oW\310\000u\311\375\031a\222\325\230:\217\342(\327\336q\234\272\030eo\355>\333\236\231\007\225\242\325\334\306 )u_\265\271\271\371\353\260zay\304tKm\346\267\000hp\244\201\221\226\245\310\310\022S\251\321\005\366\204~\247.\236v\230\221h[\252\231\025V\034\002[\261<I~\017iM?2\345\354 \357hl\307Lr\252\030\322D\223\320\215\224\026\223\250\206\2311K\330tp1\335=n?\264s\200\241\357b\026\207\346+vZ9B\200\323/N\313\324\226Q\314\330\260\270\252\034Eu\205\366:\303x\020\210\021\204\325\362e\304\010<\366x\257\331%\246\315\254\315UZ\375\035F]\364t\306\026\220\010a\257-%f\001\016e\012&\337\342\321\224k/d\231\0376\242\257\014B%\372f-\334\206\255H\320\2110\236\177\2655\214m\006\277\017x\017dR\240H,\240/\270\241K\315\377\003vT,m\351\214$\271\317q\005\320\254vz\212\206M\212\253b{\226SH\026\350\026\300\252N\256j/<R\323\012\372\246C.\327\013\0028Fv\274\006S\265\017v\364\3465|\205\334^H*L\353+\300\201\250\017\306\3336\235%\007\333?\243\273\351\272K\\\251\201^C8iB\354\276\024(\342\263V\251\005-Y\337\256\2246\337\026-\261\374\326E\374\267z\343\037\243N\304H\216\006\016\364\331\345b\023\223\277\222\224S\364\201\010Z\367\007\206\273\234{rWA\016/_;\253a>\277\030o\"\222\256o\006]Q\224\257\014\267\242\247\274k\336\371\247\273X\026\012\335\3235\344h&\370\241\265\267_\301\\\377\306\226A\003\032\"\"T\030\224\366\275\"\371\023\305\205\206\206\375\245U\026\014?\301\206\362G\373\373qZ\243\232\363\207(\260[\313s\351\237\363\360\350\216&\365S/\212\361\037]\033!*j\2549\354\005\030o\310>P^G\371\351\026\311\270\362\323\216\352\014\025\270;M\243\354\344\377\267t0\235=^q\277\365\375\023\212j\332\221$6\354O\310\013\311\231Q\36139\220\266\203\275\365\204\236h@\210;daD\365%Q\273M^h\307\2067jAQ\340\240*\034\266\023\235\344\346\222:\0310y\331\354e\020\264\353f\345Ggyxz\311\023-\037[AN\324x\242\245\031\305\230\216\220\030R\235i<=\356\254\300\342j\177\261\251\272m^1\007\031V\344Y\2046\237)\250\025\3301\337\245@\235\377\003\036s\037\362\032\234\012K\026@\320\256U\267{\210\344\337]\227BxEv\031\007\317\316y\205\200M\222=\266\237\223\264\361\310\221\256\317Y.\2521Ei\235\207d\302\206\312\005\236\363g\032\034\365!\204\307TZ\344\371\347&\261\264\373\017\026\260\032_\341\371\200^#n$xh3\260\367\236B{\323\335\343\244\372\260\236\271A\245\001[IR5N\334}\357\343\003\021\035y\037D\346x\320P}\362\2159U\007q\007\331\333z!\303\024 \220\004q\344\243\"\266\030+\032sP\375\305\232[]\017\0319\355%e\275\246\222J\363\257k\323v$VgU-\225\340\331L\020\341U7\001\005\011\205w\200\201\243\0017\002\3625%\000KM\014\0348\347vN\325\214\032\371}\222W\0117.A\3448\322\357\324\221P\365\264\216\026>`*\245\366\201MV\353U\234qz\023\300\340@\2255\215N\367=\323\025l\317\371\217\3614`_\372vJ[\346\304\373 (\273l\005\204\204\004[?\303_\321\237+\230`\241\325\310\302Ox\306%uP#L\336\212\222\261\340\273\261.\312\004v\333\346\177\352\\/\322\020l\245\334\351\345\373$\007\030\223\250{ \327\027P0\273\220$\361e\213\"K\303\220\270\221\334(\226\372Dm\221\323p\224a\372\035\247\200pj\300\276\240'\307#\222!\327\024G\341E\013\250b\025\247\014\343f\274\237\022\370l-\034]:\260\033l\361\362\246W\27288\0341>\037V\016\230\360{3\352\2436]Z\300\373\332\032J\352\303\301]\005\025`\245\246=\244\\\255\003\237\240\273\2021,1\212\000=\321\253\177\015\021U\272r5\023.\234\2655{Kw\305i\265v\225!\224c\214\341\3624\031\376-W\354\251\324k\303t\027\235l\346\032\356\212\352\200G+\236\220\000M\273NO*d\011j?\374m\215\034\211\320\247\267\364\307\354\321H=\015\373\027\302aZ\206\205<Y\335-\242r&C\310\247\224\014\251\3745,U\205\307\3053\250\332\023B8\335\005`[M\347\334T\226;&8\357\237\222\352@\264\014\256\350a\004\015_D\374\20023\35507\222\230\002\226=\361\360\005\267\004,X\276\002p\257\014\340_\304\271\223`\202I2\323'\245\216|#\322\377&\274\363z\014v\300*\364\251I\033\016\345\241r\372d\211\3408@y\251\261\325\244\267\356\322\037\013\007\030\352\200sF\241\272\347\021o\026C5r\007\323\020\357\350)\357pu\257\241\335I/:\330\272\351\1771S\325-\252v\273\206\206\232\320\007\0219<\333az\304\022\000]\026\221O\203A\212\205\011\017,\022\031$\000hp\213\012\210F9\017?\363\004)i\031\0203\227w.\267R\274\331\237\033V\241\315\010\231^\210Go\267{j\346\351G\312O\030)\277;\232>\256\263\3179\225\034\3757\310\333\363\277\342\263\326:\202m\006\336\037\205\374\223\307N\305\300ahW\214\317\200G\0011\026\037<\200\264-i\305:\312C\324\230\0150\247\240}w\3266\322\033\300\362*}?\347>[\004fC\225\024\275\342\037$X\007\220\275e\332Y\255\354\036,\3148\374\231[#\3735tr\020\035\256x\265I%#\204\311\370.vj\177\261\251\272m^1\007\031V\344Y\2046\237)\250\025\3301\337\245@\235\377\003\036s\037\362\032\234\012K\026@\320\256U\267{\210\344\337]\227BxEv\031\007\317\316y\205\200M\222=\266\237\223\264\361\310\221\256\317Y.\2521Ei\235\207d\302\034s\2368\377\276\346\0223_\310\342\276\246\320i)\274\026\374\265'?N7,\375\203\222\004\251xr\276\360\027I\345\336\230\011\352'\202= \306\227w\340\353\237\313\262\305b\254\213\005\330Z\207\310@\011\323\335`\324g=\017\352\341\257\327\245|l>\237\365\236ry9\207\265@\265\237\336mlv\201\210\262\203\332\324\237\355#\035\336\002\203\227\227i\356\335+H\012[4\005\353W\245\011\316|\232b\023\242\335\202Sf\224\301\321GMC\330%\026\320d\324)z=\200\030\351v/]k\274\365pe\265\222\206\316\233\"\035\335\321d\225q\353\326\377\377\277a\347\307\377#{\350y\005J\037X\231w\012\343r\250\340\006\267\364_\347\376\000\021\272Q\213D\247 &H)\336\221\214\302Mx/\211\035\023:\321\321\226E\224B\321\344Q>\335{,Ig\012\263\210\217B\323\002\306\325j<Qas\362\030+\3029\016Q\037\025\327\230\347}\027_\275\304vK\2202\262\324\257F\177\271P\264\"\300\205\034\003\233\006/\274b]\364\301\001\313\316e\371\332#\370-\032f\347\206n9\353iw\333\014^t\005\256\215x\261\207\334\307>\241l\212\302\035\324\202Z\3626\230\276\200t\214\314z\367 \334g\013%L\317C/r(6\264F\371I\014\037\010\271fv\360;+@\037\177\231\023\010\330'\220Qh\336o\017E\302+\356\240\200\202\331\177\325\277\011\302\332\236\324R\025\247\345\017\213\206\257\376\212k\330\024\264/\363\243\351\355U\201\017\2649B\023\026v@\333\317+eJ\221\337\177\005\327^\320\250\255k=\235p\266\235\235\211\270Z\254\321\177i\322fiG\357\265\317\010\207\326O\270\012\244\376c\011eY\026`\241w\343\002\241D\225\261\036\234`E\325\316V\332\0219\032,\036\322\266\221-\177\205,\320u\0314\362I\253?\014\371\352\234\341L4-\351D\016\\\314 o\014\352vNy\004@Lw\013P\277\032;\250F\3407\204z.\374\006\211{a\305r|\030\200\230\021%~\234g\000\226\343\177\307H\024\036\356nk!\247\313\200\237%dfD\267\244\201\304g\254\237a\\\305\304\241\351\305\320\305\037UN\326>\326\2132 \275\254RscGaIO\372\271#\357I\266E\022\2252\331\306-\271\225\250\255\221\215\266a\032\212\216\201a\320{\357;\365\371\336s\244\035\"Qy \320Y\207\364S\\(\226@\307 \272\341}\262s3\245~d\345\0013 \236\355e\312\215e\370\330~\320\034\244\376\324R\204\004\213-\343u\214\003\237\353\032!\305\365\325\022~#L\346\377R\343C\224/\261\\\365\266\021\350\327>\345\233f\242\305\203\000\313i\030\332o\\e\351s\321\360]W\374@\350E8\000\240\014\260\347\331\223\337\221\004\031\336\313\353s\231k\336\367\016\366\337f8 \236\006\321\313W\326\004\267\354s\267\266\216\272\226\2751Ov\375\364rKs*+\004d\266\010\260\240\273\251\274\331Fn*g \016\022<=\026?\222\211\0116\350\311zw\376m\305\246\025\243z\004\353\005V6no%\270\256\014\342\331P\332u\215\015{W\353\377\253\006\001\017\372\377\366.\024\365!\031\"iN\277]\260-\353n-@\200Y\364\372\021\352\331Z-8\266A\272^b\323\255\225\314pj\315J)\317@C\266Q\373\300\007\257\212\330\237\316|\037\326\026\251\247m\206\217\257\365\015\352T\356S-\314\036\010\012x\325\037\255\3769pBX\2734\033\342;\305\247*\346\3654\370\002I\230\233\027@P\304k'\256\004\037\250&`&l\256W\033{\273\1774\370m\222\233\033\216\015t\364\250\274\355B\230\034\266\221d\270\254\325\333\322\271\346\327\037Y\233o>F\337rR\021dn$h\222\275\244@M\035t\216\0226\327\356\334PZ=\367\327\360\364\253]\334ZY%z\302\213\206=\231\317\264\222\010\235.\375\304yQ\201\0148w\331\006\000\306F\275\343\344]\236\250\210\275\003\313\001\254\333\310\323\016\020\264\250\352Fv\177\272\362\231\361?1$\333w{\225\010&\326~(:Y\030nt+\373`\343\252\203R,\335\350w\375o6<V9R\023\323\301\343h\266\331 \275\254RscGaIO\372\271#\357I\266A!\231mC\205\345\377\215\230\310\275\237p\337\366oxi7\206\352\230\375\271\310\217\257o\007\363\"\206D\213\342\027i\247&\027g\033]\225A\332\317\236\252\026\315N\326(\364\205\257aCN,\203m\000\220,\236m;\003\206\345kM\311?Lq\213\030d\236|\244\303\262\223\365\030\244\2021V\322\021\367\361\204TF\316\361\307Z0\007\201\242\327_\351V7\265\236^\302.\236\234Dq\201\311\203\351\267o\213;I\010A\377\272VZ>\370)\261X\336\015sP\366\241\340yZ\316\246Dv\201Y\250\223=\331\243\024\003\000#\226#H\001\247\205\035\343\010N\005\317\022\035VR\366\3471\202\216Z\373H\370\015\205\300t\250D\225s\314\237\247=$Q\340\036\232h\234\352(\230\336U\306!\265\326\\\253\215\"!s\010\327\220T\240fZ{%\217\3062\002VJ\363S\221\374-OM#)\250\326\255\351\370\260l\270E\036{XW\254\343i:\"fQH\302\260*mP\036w\213M}?\243\245\212\242U\347%d2M\336y\247\362\226*\356\337n\337\257\313\201\210\010\022\035\310~w;\333\345\262\377w\271\226&\207\220\006\214\253\250\277\353\354\272t\2156C\222l[\216\334\226PG\217\370V\365R\323|9Gnb\266 |z\233\377;g+\367\232C3\327\207\017\276\010\344\336yoA\352\213\177\227\374\301\243\007\252\265\233:\256\323\003\321\362\326\004\030\016\017\224\231\210\237\254%\026\277\245A=\035DJG\256\322\377\024.?\006)\014g\216\234\032\314\273T\012\306]9`\000\330\316\332\337\277l\277\275\"qw\002B\332j\035\332K\334\216\317\012\"I_'\226\022\244a\313\027\253\344AF\2635\320\222\214\250\224\012\223\327$YxO\303\021]G6:\311\357@\305\003`~\3555\276\352 [\222@\321e\225\3344\254R@\256\031\371;o\037\314g\232\025\315G\275\253\226C\240\300\270H2\344h\2558\2129\344\011\0114\306\337\036.\347\332g\354\207\265\241\230\201\232s\300\353\305\250A\025\227\3607\372\364\367\255\312\243\342\244\"\216\276\373\\\242-\330\331?'(\320\205\023\374X\343\237|\021\304P\2304g\015\037 \245\363\345w\363]\"\305\012\265\305;\035\257%\237&L|\234\253\223\007w\315\253gb\347\303\260\327\213gr6g\024\336O\333F\015\235\344\037\363\306\236\232N.\370+\245\337\200\366\234/\200\264-\242E?\012\242;\313)F\215\020c.\355[\010]R\242c\233\177\214\276\230\002\302\324X-\236K\004\3063P\251,\237\260\361;y\344\363\216\330\245\362\245\356\004\234\232A\332\250\004\332\026\000\222\243\200\242S\001g\376\010S\323\016\333o\3316\353\317\325\035eni\014\013\360=1t\3276\322\330\376>\025\301\0374~\202\211G\361\020\271\361&\361Q\362\007\203!mP\245\251^\375d\202E9\013\277\321\244\257\273\023\200\\\010@\312#A\007\277\260\027\254P\0140\310\357\"\346\024H\237-\225TET`\214\225R\270Cu\242\322\016k\022\015\015a\366_'5Ell\316\360h\216HC\372\361?\256\206\264{\226\300e\344\321\254\3705v\224\177\363\212\335\034\264g\363o;=oE\355\224\024v7\013\255\237\334R\352\261\362\271-\326\034o\262\372+\026\012\011\200\341\272s\216Y\252\310\263{+<j43n\261\211\022\0235?7G\257yn\226\216\254\015\312zWn\016\2307\222\246\"6\313\307~\262\206\277Z\373\245{\376Y\276\253b\231^Q\004\225\207?\274\012:(\306\367\226I#\317@p\306\353\252\010\031\217\253$\200\216\0257j2\233;\273\367[\023bd%\006k\010\211\362\037\027\030\375\2271\034\303\225<\277\254\222\224\374\225\331\310]\014\000t]\347\273w\271\267_\351\016\266\203=\016\354\363\201)\246\376B\\\211\335\230\023\0224\177\225\212\015j\256\\\252K\235M\274[d\210\021\256\307\0022\010(\006YX\213\235\353\213X1\240;\272k\270^\200:\240\305\332\265\032\237q\011M?\236,\220\300\234\235[\003^v6\200\262\256\337&\201\253\\\331\201w\260\004v\227_\233\277\335o\036g5,\333\224=b\305\332\265\032\237q\011M?\236,\220\300\234\235[\037\311l\010\243W\027<\345\022\316\321$XVz\016\3515\022\031\347CQ\300,\275\015\256 \203\253\265V\221\017\012W\275X\372s\216\012\357G\276\000\275\005\276S\237\244\342\021\004\223\203\202\230\323W\237\365\321]\337\217\032{\360wW\356}\331\"\031\337!\322\214\024\034\306\000\310\235=\325YX\315X\201\221\231t\205\3719R\241\026\374{Z\007\034+oV\364\367\210s\341\216\275\333&\315K\245\302:\215>\242K\253,d\320\031t\226\242\346\216\273\206Pac|\373o\227\312\210\034\264w\235#\207;\210Ub\3031- \367c\304\020\255\361b\326~8\337\241\260\036-$5j\2404\250\225Q\241\261\224\373\360K\201T\273\241\025,{\200B\313>\261/\227\"*w\334\220\336=\023\324\037\034\007\020\262P\027\013\340\234\347\011\260\270C=\271I\240\342\302/\254B6\313*\244\02571\267\2569\250\016Q_\275ZUE\361\266\034FWH\277~1\215\216\\\001h,\024`\316#w~\035T\250\265`r<\223uQ\011j'*\273&\030\301\343\214L\030\350V{7\376H\263\241f\376w\342\366\016\347\327\260\307\242\340'\314dfd\177\326\004\026\317|4\201\320t\207\336\010\237f\325|\270\362\224\343(\227\326GWv\025\317\312\011\261\320\303\3356xv\214T\357B-\244\002\265\274XJVQ\017\305\212@\357\227\014J\026\357\241X\006\251Y\000\255Jn\226\356s\241\304\300\270\023\224\367\223\263\342\027\234D\367G5\032\355N\250\274\260\021\267\317i\335d!\362-\257\204\364\202\226!*\007\271\034\317\325\264\"\036\0353\305%\012\364\377?\314\032Y\332>\302x\024*\213\247\226\351\332\345?\206\206\007R\260'\231\314\033\235\342\333R \362\021O\277^\245k$\244\037\342\266\240`\363\242\015\340\010\364\237 \331\2720\205\255V(\"Y\221{\256\202\366\220q\004\030\342\015`\321[#\260\221\2153f\222b\001-\262\320r \254dR\361\275\207a\255\202_\032\331\224\321\275@\340\004\033{\300\251o\261%\214&1rmK\346RqNS\236\326\224\351\202\215\304\336V\376hz+\310N/.\034[\246j\246\2249\023\273,\321f\205I\327q\374\231\266\305\347Y:(T[\234\261=\342\203\204\327)\021\277\010\012\335\332$kQP\267\205\356\270wQ\261\002\003\323\360\241\27377\344\277$D/\266\353KF\245U<\246\316\353!L^]\231\372\257\026Z\236\200\303\212?\265\210.\317\231N\026\266\361\313\210\317$\320L\323\302qF/\025\337p>\230\034\006A\304\011\261w1\020\341\316\370\262\017\320\267\206\304\246\331\356\233\304@\022\223\233\262\305\210XG\317>\262a\340\257\326\235ae\313\027@$\233\200\230\275\201\271\362\314\"o\276.\334\225\244\304\302\221\307\253)\333L\354\365Z\354efO\002\244\335\236\014\377\023\371\304\254,\031Hc\025\310F\366\362+g\376\2318\014 W\227A\031\334\225\244\304\302\221\307\253)\333L\354\365Z\354e\256\354|\003r\272r\321(\247\262d\344\002\376\014Ae\245i\026\034h\232z\202\217uTb]\303\024\310\342\356<\011\356\034q\2776a\273\235u\351\003\321<\245\235g\252\336\301\010\343\014S\361\030\222\203TX\216\206\021\032\002x\243|\226\023\253\371\341\201K8\362\001\244\270\236\177}\3044\272\351\233\244\220O\312\204CJB\367\3267\303\374\221q\010\271\254/!\356\254\266\345\037\226\317ab\334\317Y\031\3422\351\352\202\343\342\247\247\356u\0031\274h,7c\215\024%\304\360m\032\327\010e\321\261\011\330\015\020\344\201\242g\001\334\331\343\203i\014c\030!\015\225\252\307\242\255\033\252G_\037f\247m\275\023\356%}\360R]\225.\367\322w\021\277\262\202\2379r\343\010\342\346\246g\206X\247ChD\365\242\033\272\015\332\232\012\2105\356\022\307\013(r<\322kd\240\257%\014\2659\341$\243Nc\216%\335\373g\0345f\211]8\205\033k\313\000M\265\235)\323\372\316s\250\366\232s\322YQ\365\265%\243\354\214\317\277:s\333P\345\237\332\262P2\\\303:\005\334\302\271\356._\272(\261\312Z\340I\355?h\204\310\004\253Hj5\033\344h\026Z\0122\030,0\376\247l\237\241\340N(\220\244\020;\214\200\362\212%dtq\276\341\\\210d\036\210'b,z\036b\345*\2356\273\000A\235\364^\365\362\336D\"\230\342\013P\267P\271s\367-\205\337\276\355\347\275\023c\301\351_g\221\015&>\005\251S\367U\010\264\034J\367\324\345\002\266+\367\031f\012\362U\245\301#%eFWi\203\344/\343T\375Dz\2376D\3208\232\2625v\367R<w\263\260\310v\322\216\343\306k\375\007Ig5\315\214e\360\012LP\015\241o\252\003\266\211u'B\306\337[\235S\214h\261|\3720\332\2503>\273;\015&\301\012\316 G<<\311Y\274\224\273\221CoC\3146P\004\241Omaz}\233'd\026\370\251\312\326\000x\304\352\232>\355.\201`O\352\015sS\227#\204l\374\316\002\310n\336\256@G\250\370@K\215\260\353\361\303r\316s\373\177u\305\210l\333[\266'\222G\214\334\237\216\210\370Ub\2751;\326\230\301\324\027;OBk\202\216e\376\247\245\261sw\033=X\355o\373\021\357\255{\327\015\233\311:\015x<\340\357\300\301\007\217\022pqr\021\010S\222\333\305\243oz\347\2129\272\253]\241\305\352 \006xJ\367pmD\036\205u\203\320\236u\311\373\374\357\026\016D\340]I|\372\244\326\243v\235\271\000\"\345\312\315w\252}\017\220\025ssi\"\220\327\263-\002m\307\3175}\000\341\322/#\026 \230\004\335\011J\345\366\012P\212?\033G%\275M\214\312\230c|?\245*\203\254\005\031\033\004\235\244a\277JJ|\2302\333\302\224G=Wx\351o\377,\013\242\374Y\220\026\211k\323\342\376L\016\325>\307\326\035\256\333\001Ar\0006\022\333\220\332\026\301\327\027\033QJ\345\372\\\371\2573DW\016&\245\337\014/\363\345}TV\330u\362\317\241\236\313\242\223\312\237\375|\222\001\031[\366\322\247\300Y\222[\226\274\275\341_s\274\330\334L\270\205\270\020\251\372\343\021Y\227\242\317\240??\235\305>\311S\224&f\021\305{\367\357\357\006\236\250\307\206Q\024\2607\037\330\\\315-\017n\201\2579\241\321\3235@\223\222{\345t\373\251j\031\266\206\320\021H\203\366\201va(wJ\"\361A\016\346\336\341\212B\360\320g\225\354\000_\237\231]\026xu\234&\356\233u\251\332I\210v}\002\262|4\220\254\374-n\370}\350\326\273\203\317\326D\242\325\013\326\320\227\367\004N\322\311\212\231\011\220I\3669\220\231\273\207\332\321\017\027\227\310{;Y\033\255\237\360S\005\351\236\350\364\273u\222\032\177\000\306\317\271\260\246\351\223\303\274\345\355\306\323\304\331\007h\253\267\217\2619+:\276C\265\332\013p\274hQ\3546\344\354\206J\212\023\301\337X&\371B&<\2726\354>\244\214\263\032}\355\317K\304\232+F\260D.w\233\250V\005%\267wLO\347YE\032oE\370\235ZV\014\272\250\377ZUe\224\344t[\214\356\277\202RNY\016\222\373\254\331\370=\003\201\200\332\273wuJ\034\262;\357H\001\374\236\216\211-\207;\272?74`\025\264\000\274)\232\321\321\211\013`\003\336M)6xE\316R\216\336\017\265\264@3$cK92\013\343\221R{s/x\257u%#d/'\347\301\346\262#\270\335\204s):\366Z\237\242'\204\366\315\021\257\251\017\031\001@\271\313^~tp\365.\032a\331\004\263\375\212\343\020\312\267U3Q[\226gUl\230\375\276\277\036\235\376\342.BR]RT\265D\206\004\313=OZ>\336\242\310\251i\357E(\310\336\311\317\023jR,\342\256y\021\023\216\311\241n\241fQ\242\2726\237\247\321%S\261j.3\303O_:\031\224e\027Fq\221\016\361g{\010\237\364221\340HS\353\345\207,\314\"\307\366e:\273<^\177\200\246\333\200\201\372{\2339vV\271E\005w1?/\350\000\224\352C\342u\306\302\330t\271\333\362\032@\002\327Rq\330R\261a\276S\313l5NO\304\353\233\327-o>\316tl\314\014\032t!\234\347\375\270\202\363\241\213k0\312\337U\006k\261+o\177\261\372\3328&\203,+\260\302\203\222\360\342\324|M\216\023\230p\255\361xz\267\203`\313\277\205\200\221i\210f\246$\177k\320g\304\010\330\177\353\242\223\212\005\303z\251D\3207\271_\3134o\352\320\202\272\232\240\015\306p+#h\3164*V\364\\\3437\330S\267\022\260\223\000\205\002\331p\032RN\251\346n)\247\213\254\322\204\227[.hF\262\003]\337\243F\354\303Il\316\204\206\266\304\024\255\305`\215\220\315\353z\027x\233*\004f\247\362.\216\210,\243o\217{)''u4S-\365e/\302\376\254\372\246Z\305{Dk\327B\274\240\030V\3749'\317i \305M\254]h\017\237#\303\303A\263\372\014%\311\210\304d\011\266\362-\023\027Q\275Z.[P\220\000\306\"\3305Z\303\303\303A\263\372\014%\311\210\304d\011");
		buffer.rewind();
		return buffer;
	}
	private static final Map<String, Range> assets = initAssets();
	private static Map<String, Range> initAssets() {
		Map<String, Range> assets = new HashMap<String, Range>();
		assets.put("de.appwerft.signinwith.js", new Range(0, 7680));
		return Collections.unmodifiableMap(assets);
	}


  public String readAsset(String path)
  {
    TiApplication application = TiApplication.getInstance();
    boolean isProduction = false;
    if (application != null) {
      isProduction = TiApplication.DEPLOY_TYPE_PRODUCTION.equals(application.getAppInfo().getDeployType());
    }

    if (isProduction && Debug.isDebuggerConnected()) {
      Log.e("AssetCryptImpl", "Illegal State. Exit.");
      System.exit(1);
    }

    Range range = assets.get(path);
    if (range == null) {
      return null;
    }
    return new String(filterDataInRange(assetsBytes, range.offset, range.length)); // charset encoding?
  }

  private static byte[] filterDataInRange(byte[] data, int offset, int length)
  {
    try {
      Class clazz = Class.forName("org.appcelerator.titanium.TiVerify");
      Method method = clazz.getMethod("filterDataInRange", new Class[] {data.getClass(), int.class, int.class});
      return (byte[])method.invoke(clazz, new Object[] { data, offset, length });
    } catch (Exception e) {
      Log.e("AssetCryptImpl", "Unable to load asset data.", e);
    }
    return new byte[0];
  }
}
