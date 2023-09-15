package appinventor.ai_prashant.Skyfi_Labs_Servo_Control_App;

import android.support.v4.app.FragmentTransaction;
import com.google.appinventor.components.common.PropertyTypeConstants;
import com.google.appinventor.components.runtime.ActivityStarter;
import com.google.appinventor.components.runtime.BluetoothClient;
import com.google.appinventor.components.runtime.Clock;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Image;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.ListPicker;
import com.google.appinventor.components.runtime.Slider;
import com.google.appinventor.components.runtime.errors.YailRuntimeError;
import com.google.appinventor.components.runtime.util.RetValManager;
import com.google.appinventor.components.runtime.util.RuntimeErrorAlert;
import com.google.youngandroid.runtime;
import gnu.expr.Language;
import gnu.expr.ModuleBody;
import gnu.expr.ModuleInfo;
import gnu.expr.ModuleMethod;
import gnu.kawa.functions.Apply;
import gnu.kawa.functions.Format;
import gnu.kawa.functions.GetNamedPart;
import gnu.kawa.reflect.Invoke;
import gnu.kawa.reflect.SlotGet;
import gnu.kawa.reflect.SlotSet;
import gnu.lists.Consumer;
import gnu.lists.FString;
import gnu.lists.LList;
import gnu.lists.Pair;
import gnu.lists.PairWithPosition;
import gnu.lists.VoidConsumer;
import gnu.mapping.CallContext;
import gnu.mapping.Environment;
import gnu.mapping.SimpleSymbol;
import gnu.mapping.Symbol;
import gnu.mapping.Values;
import gnu.mapping.WrongType;
import gnu.math.IntNum;
import kawa.lang.Promise;
import kawa.lib.lists;
import kawa.lib.misc;
import kawa.lib.strings;
import kawa.standard.Scheme;
import kawa.standard.require;
import org.acra.ACRAConstants;

/* compiled from: Screen1.yail */
public class Screen1 extends Form implements Runnable {
    static final SimpleSymbol Lit0 = ((SimpleSymbol) new SimpleSymbol("Screen1").readResolve());
    static final SimpleSymbol Lit1 = ((SimpleSymbol) new SimpleSymbol("getMessage").readResolve());
    static final SimpleSymbol Lit10 = ((SimpleSymbol) new SimpleSymbol("Action").readResolve());
    static final SimpleSymbol Lit100 = ((SimpleSymbol) new SimpleSymbol("Slider4").readResolve());
    static final IntNum Lit101;
    static final IntNum Lit102 = IntNum.make(4180);
    static final IntNum Lit103 = IntNum.make(4000);
    static final IntNum Lit104 = IntNum.make(4000);
    static final FString Lit105 = new FString("com.google.appinventor.components.runtime.Slider");
    static final PairWithPosition Lit106;
    static final PairWithPosition Lit107;
    static final SimpleSymbol Lit108 = ((SimpleSymbol) new SimpleSymbol("Slider4$PositionChanged").readResolve());
    static final FString Lit109 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit11 = ((SimpleSymbol) new SimpleSymbol("StartActivity").readResolve());
    static final SimpleSymbol Lit110 = ((SimpleSymbol) new SimpleSymbol("Label8").readResolve());
    static final FString Lit111 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit112 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit113 = ((SimpleSymbol) new SimpleSymbol("Label1").readResolve());
    static final FString Lit114 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit115 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit116 = ((SimpleSymbol) new SimpleSymbol("Label3").readResolve());
    static final FString Lit117 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit118 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit119 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit12 = ((SimpleSymbol) new SimpleSymbol("Screen1$Initialize").readResolve());
    static final FString Lit120 = new FString("com.google.appinventor.components.runtime.BluetoothClient");
    static final FString Lit121 = new FString("com.google.appinventor.components.runtime.BluetoothClient");
    static final FString Lit122 = new FString("com.google.appinventor.components.runtime.Clock");
    static final SimpleSymbol Lit123 = ((SimpleSymbol) new SimpleSymbol("Clock1").readResolve());
    static final FString Lit124 = new FString("com.google.appinventor.components.runtime.Clock");
    static final SimpleSymbol Lit125 = ((SimpleSymbol) new SimpleSymbol("IsConnected").readResolve());
    static final SimpleSymbol Lit126 = ((SimpleSymbol) new SimpleSymbol("TextColor").readResolve());
    static final IntNum Lit127 = IntNum.make((int) Component.COLOR_GREEN);
    static final IntNum Lit128 = IntNum.make(-3407872);
    static final SimpleSymbol Lit129 = ((SimpleSymbol) new SimpleSymbol("Clock1$Timer").readResolve());
    static final SimpleSymbol Lit13 = ((SimpleSymbol) new SimpleSymbol("Initialize").readResolve());
    static final SimpleSymbol Lit130 = ((SimpleSymbol) new SimpleSymbol("Timer").readResolve());
    static final FString Lit131 = new FString("com.google.appinventor.components.runtime.ActivityStarter");
    static final FString Lit132 = new FString("com.google.appinventor.components.runtime.ActivityStarter");
    static final SimpleSymbol Lit133 = ((SimpleSymbol) new SimpleSymbol("android-log-form").readResolve());
    static final SimpleSymbol Lit134 = ((SimpleSymbol) new SimpleSymbol("add-to-form-environment").readResolve());
    static final SimpleSymbol Lit135 = ((SimpleSymbol) new SimpleSymbol("lookup-in-form-environment").readResolve());
    static final SimpleSymbol Lit136 = ((SimpleSymbol) new SimpleSymbol("is-bound-in-form-environment").readResolve());
    static final SimpleSymbol Lit137 = ((SimpleSymbol) new SimpleSymbol("add-to-global-var-environment").readResolve());
    static final SimpleSymbol Lit138 = ((SimpleSymbol) new SimpleSymbol("add-to-events").readResolve());
    static final SimpleSymbol Lit139 = ((SimpleSymbol) new SimpleSymbol("add-to-components").readResolve());
    static final FString Lit14 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit140 = ((SimpleSymbol) new SimpleSymbol("add-to-global-vars").readResolve());
    static final SimpleSymbol Lit141 = ((SimpleSymbol) new SimpleSymbol("add-to-form-do-after-creation").readResolve());
    static final SimpleSymbol Lit142 = ((SimpleSymbol) new SimpleSymbol("send-error").readResolve());
    static final SimpleSymbol Lit143 = ((SimpleSymbol) new SimpleSymbol("dispatchEvent").readResolve());
    static final SimpleSymbol Lit144 = ((SimpleSymbol) new SimpleSymbol("lookup-handler").readResolve());
    static final SimpleSymbol Lit15 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement5").readResolve());
    static final SimpleSymbol Lit16 = ((SimpleSymbol) new SimpleSymbol("AlignHorizontal").readResolve());
    static final IntNum Lit17 = IntNum.make(3);
    static final SimpleSymbol Lit18;
    static final SimpleSymbol Lit19 = ((SimpleSymbol) new SimpleSymbol("Width").readResolve());
    static final SimpleSymbol Lit2 = ((SimpleSymbol) new SimpleSymbol("*the-null-value*").readResolve());
    static final IntNum Lit20 = IntNum.make(-2);
    static final FString Lit21 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit22 = new FString("com.google.appinventor.components.runtime.Image");
    static final SimpleSymbol Lit23 = ((SimpleSymbol) new SimpleSymbol("Image1").readResolve());
    static final SimpleSymbol Lit24 = ((SimpleSymbol) new SimpleSymbol("Height").readResolve());
    static final IntNum Lit25 = IntNum.make(70);
    static final IntNum Lit26 = IntNum.make(250);
    static final SimpleSymbol Lit27 = ((SimpleSymbol) new SimpleSymbol("Picture").readResolve());
    static final FString Lit28 = new FString("com.google.appinventor.components.runtime.Image");
    static final FString Lit29 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit3 = ((SimpleSymbol) new SimpleSymbol("AppName").readResolve());
    static final SimpleSymbol Lit30 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement6").readResolve());
    static final FString Lit31 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit32 = new FString("com.google.appinventor.components.runtime.ListPicker");
    static final SimpleSymbol Lit33 = ((SimpleSymbol) new SimpleSymbol("ListPicker1").readResolve());
    static final IntNum Lit34 = IntNum.make(50);
    static final IntNum Lit35 = IntNum.make(150);
    static final SimpleSymbol Lit36 = ((SimpleSymbol) new SimpleSymbol("Image").readResolve());
    static final FString Lit37 = new FString("com.google.appinventor.components.runtime.ListPicker");
    static final SimpleSymbol Lit38 = ((SimpleSymbol) new SimpleSymbol("Elements").readResolve());
    static final SimpleSymbol Lit39 = ((SimpleSymbol) new SimpleSymbol("BluetoothClient1").readResolve());
    static final SimpleSymbol Lit4;
    static final SimpleSymbol Lit40 = ((SimpleSymbol) new SimpleSymbol("AddressesAndNames").readResolve());
    static final SimpleSymbol Lit41 = ((SimpleSymbol) new SimpleSymbol("list").readResolve());
    static final SimpleSymbol Lit42 = ((SimpleSymbol) new SimpleSymbol("ListPicker1$BeforePicking").readResolve());
    static final SimpleSymbol Lit43 = ((SimpleSymbol) new SimpleSymbol("BeforePicking").readResolve());
    static final SimpleSymbol Lit44 = ((SimpleSymbol) new SimpleSymbol("Connect").readResolve());
    static final SimpleSymbol Lit45 = ((SimpleSymbol) new SimpleSymbol("Selection").readResolve());
    static final PairWithPosition Lit46 = PairWithPosition.make(Lit4, LList.Empty, "/tmp/1518076393813_0.8459548618876271-0/youngandroidproject/../src/appinventor/ai_prashant/Skyfi_Labs_Servo_Control_App/Screen1.yail", 254072);
    static final SimpleSymbol Lit47 = ((SimpleSymbol) new SimpleSymbol("ListPicker1$AfterPicking").readResolve());
    static final SimpleSymbol Lit48 = ((SimpleSymbol) new SimpleSymbol("AfterPicking").readResolve());
    static final FString Lit49 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit5 = ((SimpleSymbol) new SimpleSymbol("CloseScreenAnimation").readResolve());
    static final SimpleSymbol Lit50 = ((SimpleSymbol) new SimpleSymbol("Label4").readResolve());
    static final SimpleSymbol Lit51 = ((SimpleSymbol) new SimpleSymbol("Text").readResolve());
    static final FString Lit52 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit53 = new FString("com.google.appinventor.components.runtime.Slider");
    static final SimpleSymbol Lit54 = ((SimpleSymbol) new SimpleSymbol("Slider1").readResolve());
    static final SimpleSymbol Lit55 = ((SimpleSymbol) new SimpleSymbol("ColorLeft").readResolve());
    static final IntNum Lit56;
    static final SimpleSymbol Lit57 = ((SimpleSymbol) new SimpleSymbol("MaxValue").readResolve());
    static final IntNum Lit58 = IntNum.make(1180);
    static final SimpleSymbol Lit59 = ((SimpleSymbol) new SimpleSymbol("MinValue").readResolve());
    static final SimpleSymbol Lit6 = ((SimpleSymbol) new SimpleSymbol("OpenScreenAnimation").readResolve());
    static final IntNum Lit60 = IntNum.make(1000);
    static final SimpleSymbol Lit61 = ((SimpleSymbol) new SimpleSymbol("ThumbPosition").readResolve());
    static final IntNum Lit62 = IntNum.make(1090);
    static final FString Lit63 = new FString("com.google.appinventor.components.runtime.Slider");
    static final SimpleSymbol Lit64 = ((SimpleSymbol) new SimpleSymbol("Label2").readResolve());
    static final SimpleSymbol Lit65 = ((SimpleSymbol) new SimpleSymbol("Send2ByteNumber").readResolve());
    static final PairWithPosition Lit66 = PairWithPosition.make(Lit18, LList.Empty, "/tmp/1518076393813_0.8459548618876271-0/youngandroidproject/../src/appinventor/ai_prashant/Skyfi_Labs_Servo_Control_App/Screen1.yail", 352517);
    static final PairWithPosition Lit67 = PairWithPosition.make(Lit4, LList.Empty, "/tmp/1518076393813_0.8459548618876271-0/youngandroidproject/../src/appinventor/ai_prashant/Skyfi_Labs_Servo_Control_App/Screen1.yail", 352537);
    static final SimpleSymbol Lit68 = ((SimpleSymbol) new SimpleSymbol("Slider1$PositionChanged").readResolve());
    static final SimpleSymbol Lit69 = ((SimpleSymbol) new SimpleSymbol("PositionChanged").readResolve());
    static final SimpleSymbol Lit7 = ((SimpleSymbol) new SimpleSymbol("ScreenOrientation").readResolve());
    static final FString Lit70 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit71 = ((SimpleSymbol) new SimpleSymbol("Label5").readResolve());
    static final FString Lit72 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit73 = new FString("com.google.appinventor.components.runtime.Slider");
    static final SimpleSymbol Lit74 = ((SimpleSymbol) new SimpleSymbol("Slider2").readResolve());
    static final IntNum Lit75;
    static final IntNum Lit76 = IntNum.make(2180);
    static final IntNum Lit77 = IntNum.make(2000);
    static final IntNum Lit78 = IntNum.make(2090);
    static final FString Lit79 = new FString("com.google.appinventor.components.runtime.Slider");
    static final SimpleSymbol Lit8 = ((SimpleSymbol) new SimpleSymbol("Title").readResolve());
    static final PairWithPosition Lit80 = PairWithPosition.make(Lit18, LList.Empty, "/tmp/1518076393813_0.8459548618876271-0/youngandroidproject/../src/appinventor/ai_prashant/Skyfi_Labs_Servo_Control_App/Screen1.yail", 450821);
    static final PairWithPosition Lit81 = PairWithPosition.make(Lit4, LList.Empty, "/tmp/1518076393813_0.8459548618876271-0/youngandroidproject/../src/appinventor/ai_prashant/Skyfi_Labs_Servo_Control_App/Screen1.yail", 450841);
    static final SimpleSymbol Lit82 = ((SimpleSymbol) new SimpleSymbol("Slider2$PositionChanged").readResolve());
    static final FString Lit83 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit84 = ((SimpleSymbol) new SimpleSymbol("Label6").readResolve());
    static final FString Lit85 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit86 = new FString("com.google.appinventor.components.runtime.Slider");
    static final SimpleSymbol Lit87 = ((SimpleSymbol) new SimpleSymbol("Slider3").readResolve());
    static final IntNum Lit88;
    static final IntNum Lit89 = IntNum.make(3180);
    static final SimpleSymbol Lit9 = ((SimpleSymbol) new SimpleSymbol("ActivityStarter1").readResolve());
    static final IntNum Lit90 = IntNum.make((int) ACRAConstants.DEFAULT_CONNECTION_TIMEOUT);
    static final IntNum Lit91 = IntNum.make(3040);
    static final FString Lit92 = new FString("com.google.appinventor.components.runtime.Slider");
    static final PairWithPosition Lit93 = PairWithPosition.make(Lit18, LList.Empty, "/tmp/1518076393813_0.8459548618876271-0/youngandroidproject/../src/appinventor/ai_prashant/Skyfi_Labs_Servo_Control_App/Screen1.yail", 549125);
    static final PairWithPosition Lit94 = PairWithPosition.make(Lit4, LList.Empty, "/tmp/1518076393813_0.8459548618876271-0/youngandroidproject/../src/appinventor/ai_prashant/Skyfi_Labs_Servo_Control_App/Screen1.yail", 549145);
    static final SimpleSymbol Lit95 = ((SimpleSymbol) new SimpleSymbol("Slider3$PositionChanged").readResolve());
    static final FString Lit96 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit97 = ((SimpleSymbol) new SimpleSymbol("Label7").readResolve());
    static final FString Lit98 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit99 = new FString("com.google.appinventor.components.runtime.Slider");
    public static Screen1 Screen1;
    static final ModuleMethod lambda$Fn1 = null;
    static final ModuleMethod lambda$Fn10 = null;
    static final ModuleMethod lambda$Fn11 = null;
    static final ModuleMethod lambda$Fn12 = null;
    static final ModuleMethod lambda$Fn13 = null;
    static final ModuleMethod lambda$Fn14 = null;
    static final ModuleMethod lambda$Fn15 = null;
    static final ModuleMethod lambda$Fn16 = null;
    static final ModuleMethod lambda$Fn17 = null;
    static final ModuleMethod lambda$Fn18 = null;
    static final ModuleMethod lambda$Fn19 = null;
    static final ModuleMethod lambda$Fn2 = null;
    static final ModuleMethod lambda$Fn20 = null;
    static final ModuleMethod lambda$Fn21 = null;
    static final ModuleMethod lambda$Fn22 = null;
    static final ModuleMethod lambda$Fn23 = null;
    static final ModuleMethod lambda$Fn24 = null;
    static final ModuleMethod lambda$Fn25 = null;
    static final ModuleMethod lambda$Fn26 = null;
    static final ModuleMethod lambda$Fn27 = null;
    static final ModuleMethod lambda$Fn28 = null;
    static final ModuleMethod lambda$Fn29 = null;
    static final ModuleMethod lambda$Fn3 = null;
    static final ModuleMethod lambda$Fn30 = null;
    static final ModuleMethod lambda$Fn31 = null;
    static final ModuleMethod lambda$Fn32 = null;
    static final ModuleMethod lambda$Fn4 = null;
    static final ModuleMethod lambda$Fn5 = null;
    static final ModuleMethod lambda$Fn6 = null;
    static final ModuleMethod lambda$Fn7 = null;
    static final ModuleMethod lambda$Fn8 = null;
    static final ModuleMethod lambda$Fn9 = null;
    public Boolean $Stdebug$Mnform$St;
    public final ModuleMethod $define;
    public ActivityStarter ActivityStarter1;
    public BluetoothClient BluetoothClient1;
    public Clock Clock1;
    public final ModuleMethod Clock1$Timer;
    public HorizontalArrangement HorizontalArrangement5;
    public HorizontalArrangement HorizontalArrangement6;
    public Image Image1;
    public Label Label1;
    public Label Label2;
    public Label Label3;
    public Label Label4;
    public Label Label5;
    public Label Label6;
    public Label Label7;
    public Label Label8;
    public ListPicker ListPicker1;
    public final ModuleMethod ListPicker1$AfterPicking;
    public final ModuleMethod ListPicker1$BeforePicking;
    public final ModuleMethod Screen1$Initialize;
    public Slider Slider1;
    public final ModuleMethod Slider1$PositionChanged;
    public Slider Slider2;
    public final ModuleMethod Slider2$PositionChanged;
    public Slider Slider3;
    public final ModuleMethod Slider3$PositionChanged;
    public Slider Slider4;
    public final ModuleMethod Slider4$PositionChanged;
    public final ModuleMethod add$Mnto$Mncomponents;
    public final ModuleMethod add$Mnto$Mnevents;
    public final ModuleMethod add$Mnto$Mnform$Mndo$Mnafter$Mncreation;
    public final ModuleMethod add$Mnto$Mnform$Mnenvironment;
    public final ModuleMethod add$Mnto$Mnglobal$Mnvar$Mnenvironment;
    public final ModuleMethod add$Mnto$Mnglobal$Mnvars;
    public final ModuleMethod android$Mnlog$Mnform;
    public LList components$Mnto$Mncreate;
    public final ModuleMethod dispatchEvent;
    public LList events$Mnto$Mnregister;
    public LList form$Mndo$Mnafter$Mncreation;
    public Environment form$Mnenvironment;
    public Symbol form$Mnname$Mnsymbol;
    public Environment global$Mnvar$Mnenvironment;
    public LList global$Mnvars$Mnto$Mncreate;
    public final ModuleMethod is$Mnbound$Mnin$Mnform$Mnenvironment;
    public final ModuleMethod lookup$Mnhandler;
    public final ModuleMethod lookup$Mnin$Mnform$Mnenvironment;
    public final ModuleMethod process$Mnexception;
    public final ModuleMethod send$Mnerror;

    static {
        SimpleSymbol simpleSymbol = (SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_TEXT).readResolve();
        Lit4 = simpleSymbol;
        Lit107 = PairWithPosition.make(simpleSymbol, LList.Empty, "/tmp/1518076393813_0.8459548618876271-0/youngandroidproject/../src/appinventor/ai_prashant/Skyfi_Labs_Servo_Control_App/Screen1.yail", 647449);
        SimpleSymbol simpleSymbol2 = (SimpleSymbol) new SimpleSymbol("number").readResolve();
        Lit18 = simpleSymbol2;
        Lit106 = PairWithPosition.make(simpleSymbol2, LList.Empty, "/tmp/1518076393813_0.8459548618876271-0/youngandroidproject/../src/appinventor/ai_prashant/Skyfi_Labs_Servo_Control_App/Screen1.yail", 647429);
        int[] iArr = new int[2];
        iArr[0] = -65536;
        Lit101 = IntNum.make(iArr);
        int[] iArr2 = new int[2];
        iArr2[0] = -16711936;
        Lit88 = IntNum.make(iArr2);
        int[] iArr3 = new int[2];
        iArr3[0] = -16711681;
        Lit75 = IntNum.make(iArr3);
        int[] iArr4 = new int[2];
        iArr4[0] = -16776961;
        Lit56 = IntNum.make(iArr4);
    }

    public Screen1() {
        ModuleInfo.register(this);
        frame frame2 = new frame();
        frame2.$main = this;
        this.android$Mnlog$Mnform = new ModuleMethod(frame2, 1, Lit133, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnform$Mnenvironment = new ModuleMethod(frame2, 2, Lit134, 8194);
        this.lookup$Mnin$Mnform$Mnenvironment = new ModuleMethod(frame2, 3, Lit135, 8193);
        this.is$Mnbound$Mnin$Mnform$Mnenvironment = new ModuleMethod(frame2, 5, Lit136, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnglobal$Mnvar$Mnenvironment = new ModuleMethod(frame2, 6, Lit137, 8194);
        this.add$Mnto$Mnevents = new ModuleMethod(frame2, 7, Lit138, 8194);
        this.add$Mnto$Mncomponents = new ModuleMethod(frame2, 8, Lit139, 16388);
        this.add$Mnto$Mnglobal$Mnvars = new ModuleMethod(frame2, 9, Lit140, 8194);
        this.add$Mnto$Mnform$Mndo$Mnafter$Mncreation = new ModuleMethod(frame2, 10, Lit141, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.send$Mnerror = new ModuleMethod(frame2, 11, Lit142, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.process$Mnexception = new ModuleMethod(frame2, 12, "process-exception", FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.dispatchEvent = new ModuleMethod(frame2, 13, Lit143, 16388);
        this.lookup$Mnhandler = new ModuleMethod(frame2, 14, Lit144, 8194);
        ModuleMethod moduleMethod = new ModuleMethod(frame2, 15, (Object) null, 0);
        moduleMethod.setProperty("source-location", "/tmp/runtime5572844422116645848.scm:553");
        lambda$Fn1 = moduleMethod;
        this.$define = new ModuleMethod(frame2, 16, "$define", 0);
        lambda$Fn2 = new ModuleMethod(frame2, 17, (Object) null, 0);
        this.Screen1$Initialize = new ModuleMethod(frame2, 18, Lit12, 0);
        lambda$Fn3 = new ModuleMethod(frame2, 19, (Object) null, 0);
        lambda$Fn4 = new ModuleMethod(frame2, 20, (Object) null, 0);
        lambda$Fn5 = new ModuleMethod(frame2, 21, (Object) null, 0);
        lambda$Fn6 = new ModuleMethod(frame2, 22, (Object) null, 0);
        lambda$Fn7 = new ModuleMethod(frame2, 23, (Object) null, 0);
        lambda$Fn8 = new ModuleMethod(frame2, 24, (Object) null, 0);
        lambda$Fn9 = new ModuleMethod(frame2, 25, (Object) null, 0);
        lambda$Fn10 = new ModuleMethod(frame2, 26, (Object) null, 0);
        this.ListPicker1$BeforePicking = new ModuleMethod(frame2, 27, Lit42, 0);
        this.ListPicker1$AfterPicking = new ModuleMethod(frame2, 28, Lit47, 0);
        lambda$Fn11 = new ModuleMethod(frame2, 29, (Object) null, 0);
        lambda$Fn12 = new ModuleMethod(frame2, 30, (Object) null, 0);
        lambda$Fn13 = new ModuleMethod(frame2, 31, (Object) null, 0);
        lambda$Fn14 = new ModuleMethod(frame2, 32, (Object) null, 0);
        this.Slider1$PositionChanged = new ModuleMethod(frame2, 33, Lit68, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        lambda$Fn15 = new ModuleMethod(frame2, 34, (Object) null, 0);
        lambda$Fn16 = new ModuleMethod(frame2, 35, (Object) null, 0);
        lambda$Fn17 = new ModuleMethod(frame2, 36, (Object) null, 0);
        lambda$Fn18 = new ModuleMethod(frame2, 37, (Object) null, 0);
        this.Slider2$PositionChanged = new ModuleMethod(frame2, 38, Lit82, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        lambda$Fn19 = new ModuleMethod(frame2, 39, (Object) null, 0);
        lambda$Fn20 = new ModuleMethod(frame2, 40, (Object) null, 0);
        lambda$Fn21 = new ModuleMethod(frame2, 41, (Object) null, 0);
        lambda$Fn22 = new ModuleMethod(frame2, 42, (Object) null, 0);
        this.Slider3$PositionChanged = new ModuleMethod(frame2, 43, Lit95, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        lambda$Fn23 = new ModuleMethod(frame2, 44, (Object) null, 0);
        lambda$Fn24 = new ModuleMethod(frame2, 45, (Object) null, 0);
        lambda$Fn25 = new ModuleMethod(frame2, 46, (Object) null, 0);
        lambda$Fn26 = new ModuleMethod(frame2, 47, (Object) null, 0);
        this.Slider4$PositionChanged = new ModuleMethod(frame2, 48, Lit108, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        lambda$Fn27 = new ModuleMethod(frame2, 49, (Object) null, 0);
        lambda$Fn28 = new ModuleMethod(frame2, 50, (Object) null, 0);
        lambda$Fn29 = new ModuleMethod(frame2, 51, (Object) null, 0);
        lambda$Fn30 = new ModuleMethod(frame2, 52, (Object) null, 0);
        lambda$Fn31 = new ModuleMethod(frame2, 53, (Object) null, 0);
        lambda$Fn32 = new ModuleMethod(frame2, 54, (Object) null, 0);
        this.Clock1$Timer = new ModuleMethod(frame2, 55, Lit129, 0);
    }

    public Object lookupInFormEnvironment(Symbol symbol) {
        return lookupInFormEnvironment(symbol, Boolean.FALSE);
    }

    public void run() {
        CallContext instance = CallContext.getInstance();
        Consumer consumer = instance.consumer;
        instance.consumer = VoidConsumer.instance;
        try {
            run(instance);
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        ModuleBody.runCleanup(instance, th, consumer);
    }

    public final void run(CallContext $ctx) {
        String obj;
        Consumer $result = $ctx.consumer;
        Object find = require.find("com.google.youngandroid.runtime");
        try {
            ((Runnable) find).run();
            this.$Stdebug$Mnform$St = Boolean.FALSE;
            this.form$Mnenvironment = Environment.make(misc.symbol$To$String(Lit0));
            FString stringAppend = strings.stringAppend(misc.symbol$To$String(Lit0), "-global-vars");
            if (stringAppend == null) {
                obj = null;
            } else {
                obj = stringAppend.toString();
            }
            this.global$Mnvar$Mnenvironment = Environment.make(obj);
            Screen1 = null;
            this.form$Mnname$Mnsymbol = Lit0;
            this.events$Mnto$Mnregister = LList.Empty;
            this.components$Mnto$Mncreate = LList.Empty;
            this.global$Mnvars$Mnto$Mncreate = LList.Empty;
            this.form$Mndo$Mnafter$Mncreation = LList.Empty;
            Object find2 = require.find("com.google.youngandroid.runtime");
            try {
                ((Runnable) find2).run();
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit3, "Skyfi Labs Servo Control App", Lit4);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit5, "fade", Lit4);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit6, "fade", Lit4);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit7, "portrait", Lit4);
                    Values.writeValues(runtime.setAndCoerceProperty$Ex(Lit0, Lit8, "Screen1", Lit4), $result);
                } else {
                    addToFormDoAfterCreation(new Promise(lambda$Fn2));
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit12, this.Screen1$Initialize);
                } else {
                    addToFormEnvironment(Lit12, this.Screen1$Initialize);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Screen1", "Initialize");
                } else {
                    addToEvents(Lit0, Lit13);
                }
                this.HorizontalArrangement5 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit14, Lit15, lambda$Fn3), $result);
                } else {
                    addToComponents(Lit0, Lit21, Lit15, lambda$Fn4);
                }
                this.Image1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit15, Lit22, Lit23, lambda$Fn5), $result);
                } else {
                    addToComponents(Lit15, Lit28, Lit23, lambda$Fn6);
                }
                this.HorizontalArrangement6 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit29, Lit30, lambda$Fn7), $result);
                } else {
                    addToComponents(Lit0, Lit31, Lit30, lambda$Fn8);
                }
                this.ListPicker1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit30, Lit32, Lit33, lambda$Fn9), $result);
                } else {
                    addToComponents(Lit30, Lit37, Lit33, lambda$Fn10);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit42, this.ListPicker1$BeforePicking);
                } else {
                    addToFormEnvironment(Lit42, this.ListPicker1$BeforePicking);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "ListPicker1", "BeforePicking");
                } else {
                    addToEvents(Lit33, Lit43);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit47, this.ListPicker1$AfterPicking);
                } else {
                    addToFormEnvironment(Lit47, this.ListPicker1$AfterPicking);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "ListPicker1", "AfterPicking");
                } else {
                    addToEvents(Lit33, Lit48);
                }
                this.Label4 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit49, Lit50, lambda$Fn11), $result);
                } else {
                    addToComponents(Lit0, Lit52, Lit50, lambda$Fn12);
                }
                this.Slider1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit53, Lit54, lambda$Fn13), $result);
                } else {
                    addToComponents(Lit0, Lit63, Lit54, lambda$Fn14);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit68, this.Slider1$PositionChanged);
                } else {
                    addToFormEnvironment(Lit68, this.Slider1$PositionChanged);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Slider1", "PositionChanged");
                } else {
                    addToEvents(Lit54, Lit69);
                }
                this.Label5 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit70, Lit71, lambda$Fn15), $result);
                } else {
                    addToComponents(Lit0, Lit72, Lit71, lambda$Fn16);
                }
                this.Slider2 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit73, Lit74, lambda$Fn17), $result);
                } else {
                    addToComponents(Lit0, Lit79, Lit74, lambda$Fn18);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit82, this.Slider2$PositionChanged);
                } else {
                    addToFormEnvironment(Lit82, this.Slider2$PositionChanged);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Slider2", "PositionChanged");
                } else {
                    addToEvents(Lit74, Lit69);
                }
                this.Label6 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit83, Lit84, lambda$Fn19), $result);
                } else {
                    addToComponents(Lit0, Lit85, Lit84, lambda$Fn20);
                }
                this.Slider3 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit86, Lit87, lambda$Fn21), $result);
                } else {
                    addToComponents(Lit0, Lit92, Lit87, lambda$Fn22);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit95, this.Slider3$PositionChanged);
                } else {
                    addToFormEnvironment(Lit95, this.Slider3$PositionChanged);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Slider3", "PositionChanged");
                } else {
                    addToEvents(Lit87, Lit69);
                }
                this.Label7 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit96, Lit97, lambda$Fn23), $result);
                } else {
                    addToComponents(Lit0, Lit98, Lit97, lambda$Fn24);
                }
                this.Slider4 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit99, Lit100, lambda$Fn25), $result);
                } else {
                    addToComponents(Lit0, Lit105, Lit100, lambda$Fn26);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit108, this.Slider4$PositionChanged);
                } else {
                    addToFormEnvironment(Lit108, this.Slider4$PositionChanged);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Slider4", "PositionChanged");
                } else {
                    addToEvents(Lit100, Lit69);
                }
                this.Label8 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit109, Lit110, lambda$Fn27), $result);
                } else {
                    addToComponents(Lit0, Lit111, Lit110, lambda$Fn28);
                }
                this.Label1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit112, Lit113, lambda$Fn29), $result);
                } else {
                    addToComponents(Lit0, Lit114, Lit113, lambda$Fn30);
                }
                this.Label3 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit115, Lit116, lambda$Fn31), $result);
                } else {
                    addToComponents(Lit0, Lit117, Lit116, lambda$Fn32);
                }
                this.Label2 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit118, Lit64, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit119, Lit64, Boolean.FALSE);
                }
                this.BluetoothClient1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit120, Lit39, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit121, Lit39, Boolean.FALSE);
                }
                this.Clock1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit122, Lit123, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit124, Lit123, Boolean.FALSE);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit129, this.Clock1$Timer);
                } else {
                    addToFormEnvironment(Lit129, this.Clock1$Timer);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Clock1", "Timer");
                } else {
                    addToEvents(Lit123, Lit130);
                }
                this.ActivityStarter1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit131, Lit9, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit132, Lit9, Boolean.FALSE);
                }
                runtime.initRuntime();
            } catch (ClassCastException e) {
                throw new WrongType(e, "java.lang.Runnable.run()", 1, find2);
            }
        } catch (ClassCastException e2) {
            throw new WrongType(e2, "java.lang.Runnable.run()", 1, find);
        }
    }

    static Object lambda3() {
        runtime.setAndCoerceProperty$Ex(Lit0, Lit3, "Skyfi Labs Servo Control App", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit5, "fade", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit6, "fade", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit7, "portrait", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit0, Lit8, "Screen1", Lit4);
    }

    public Object Screen1$Initialize() {
        runtime.setThisForm();
        runtime.setAndCoerceProperty$Ex(Lit9, Lit10, "android.bluetooth.adapter.action.REQUEST_ENABLE", Lit4);
        return runtime.callComponentMethod(Lit9, Lit11, LList.Empty, LList.Empty);
    }

    static Object lambda4() {
        runtime.setAndCoerceProperty$Ex(Lit15, Lit16, Lit17, Lit18);
        return runtime.setAndCoerceProperty$Ex(Lit15, Lit19, Lit20, Lit18);
    }

    static Object lambda5() {
        runtime.setAndCoerceProperty$Ex(Lit15, Lit16, Lit17, Lit18);
        return runtime.setAndCoerceProperty$Ex(Lit15, Lit19, Lit20, Lit18);
    }

    static Object lambda6() {
        runtime.setAndCoerceProperty$Ex(Lit23, Lit24, Lit25, Lit18);
        runtime.setAndCoerceProperty$Ex(Lit23, Lit19, Lit26, Lit18);
        return runtime.setAndCoerceProperty$Ex(Lit23, Lit27, "Transparent-background(2).png", Lit4);
    }

    static Object lambda7() {
        runtime.setAndCoerceProperty$Ex(Lit23, Lit24, Lit25, Lit18);
        runtime.setAndCoerceProperty$Ex(Lit23, Lit19, Lit26, Lit18);
        return runtime.setAndCoerceProperty$Ex(Lit23, Lit27, "Transparent-background(2).png", Lit4);
    }

    static Object lambda8() {
        runtime.setAndCoerceProperty$Ex(Lit30, Lit16, Lit17, Lit18);
        return runtime.setAndCoerceProperty$Ex(Lit30, Lit19, Lit20, Lit18);
    }

    static Object lambda9() {
        runtime.setAndCoerceProperty$Ex(Lit30, Lit16, Lit17, Lit18);
        return runtime.setAndCoerceProperty$Ex(Lit30, Lit19, Lit20, Lit18);
    }

    static Object lambda10() {
        runtime.setAndCoerceProperty$Ex(Lit33, Lit24, Lit34, Lit18);
        runtime.setAndCoerceProperty$Ex(Lit33, Lit19, Lit35, Lit18);
        return runtime.setAndCoerceProperty$Ex(Lit33, Lit36, "2013-05-22-skeuomorphism-button-flat.png", Lit4);
    }

    static Object lambda11() {
        runtime.setAndCoerceProperty$Ex(Lit33, Lit24, Lit34, Lit18);
        runtime.setAndCoerceProperty$Ex(Lit33, Lit19, Lit35, Lit18);
        return runtime.setAndCoerceProperty$Ex(Lit33, Lit36, "2013-05-22-skeuomorphism-button-flat.png", Lit4);
    }

    public Object ListPicker1$BeforePicking() {
        runtime.setThisForm();
        return runtime.setAndCoerceProperty$Ex(Lit33, Lit38, runtime.getProperty$1(Lit39, Lit40), Lit41);
    }

    public Object ListPicker1$AfterPicking() {
        runtime.setThisForm();
        return runtime.callComponentMethod(Lit39, Lit44, LList.list1(runtime.getProperty$1(Lit33, Lit45)), Lit46) != Boolean.FALSE ? runtime.setAndCoerceProperty$Ex(Lit33, Lit38, runtime.getProperty$1(Lit39, Lit40), Lit41) : Values.empty;
    }

    static Object lambda12() {
        return runtime.setAndCoerceProperty$Ex(Lit50, Lit51, "Servo X :", Lit4);
    }

    static Object lambda13() {
        return runtime.setAndCoerceProperty$Ex(Lit50, Lit51, "Servo X :", Lit4);
    }

    static Object lambda14() {
        runtime.setAndCoerceProperty$Ex(Lit54, Lit55, Lit56, Lit18);
        runtime.setAndCoerceProperty$Ex(Lit54, Lit19, Lit20, Lit18);
        runtime.setAndCoerceProperty$Ex(Lit54, Lit57, Lit58, Lit18);
        runtime.setAndCoerceProperty$Ex(Lit54, Lit59, Lit60, Lit18);
        return runtime.setAndCoerceProperty$Ex(Lit54, Lit61, Lit62, Lit18);
    }

    static Object lambda15() {
        runtime.setAndCoerceProperty$Ex(Lit54, Lit55, Lit56, Lit18);
        runtime.setAndCoerceProperty$Ex(Lit54, Lit19, Lit20, Lit18);
        runtime.setAndCoerceProperty$Ex(Lit54, Lit57, Lit58, Lit18);
        runtime.setAndCoerceProperty$Ex(Lit54, Lit59, Lit60, Lit18);
        return runtime.setAndCoerceProperty$Ex(Lit54, Lit61, Lit62, Lit18);
    }

    public Object Slider1$PositionChanged(Object $thumbPosition) {
        runtime.sanitizeComponentData($thumbPosition);
        runtime.setThisForm();
        runtime.setAndCoerceProperty$Ex(Lit64, Lit51, runtime.getProperty$1(Lit54, Lit61), Lit4);
        return runtime.callComponentMethod(Lit39, Lit65, LList.list1(runtime.callYailPrimitive(runtime.yail$Mnround, LList.list1(runtime.getProperty$1(Lit54, Lit61)), Lit66, "round")), Lit67);
    }

    static Object lambda16() {
        return runtime.setAndCoerceProperty$Ex(Lit71, Lit51, "Servo Y :", Lit4);
    }

    static Object lambda17() {
        return runtime.setAndCoerceProperty$Ex(Lit71, Lit51, "Servo Y :", Lit4);
    }

    static Object lambda18() {
        runtime.setAndCoerceProperty$Ex(Lit74, Lit55, Lit75, Lit18);
        runtime.setAndCoerceProperty$Ex(Lit74, Lit19, Lit20, Lit18);
        runtime.setAndCoerceProperty$Ex(Lit74, Lit57, Lit76, Lit18);
        runtime.setAndCoerceProperty$Ex(Lit74, Lit59, Lit77, Lit18);
        return runtime.setAndCoerceProperty$Ex(Lit74, Lit61, Lit78, Lit18);
    }

    static Object lambda19() {
        runtime.setAndCoerceProperty$Ex(Lit74, Lit55, Lit75, Lit18);
        runtime.setAndCoerceProperty$Ex(Lit74, Lit19, Lit20, Lit18);
        runtime.setAndCoerceProperty$Ex(Lit74, Lit57, Lit76, Lit18);
        runtime.setAndCoerceProperty$Ex(Lit74, Lit59, Lit77, Lit18);
        return runtime.setAndCoerceProperty$Ex(Lit74, Lit61, Lit78, Lit18);
    }

    public Object Slider2$PositionChanged(Object $thumbPosition) {
        runtime.sanitizeComponentData($thumbPosition);
        runtime.setThisForm();
        runtime.setAndCoerceProperty$Ex(Lit64, Lit51, runtime.getProperty$1(Lit74, Lit61), Lit4);
        return runtime.callComponentMethod(Lit39, Lit65, LList.list1(runtime.callYailPrimitive(runtime.yail$Mnround, LList.list1(runtime.getProperty$1(Lit74, Lit61)), Lit80, "round")), Lit81);
    }

    static Object lambda20() {
        return runtime.setAndCoerceProperty$Ex(Lit84, Lit51, "Servo Z :", Lit4);
    }

    static Object lambda21() {
        return runtime.setAndCoerceProperty$Ex(Lit84, Lit51, "Servo Z :", Lit4);
    }

    static Object lambda22() {
        runtime.setAndCoerceProperty$Ex(Lit87, Lit55, Lit88, Lit18);
        runtime.setAndCoerceProperty$Ex(Lit87, Lit19, Lit20, Lit18);
        runtime.setAndCoerceProperty$Ex(Lit87, Lit57, Lit89, Lit18);
        runtime.setAndCoerceProperty$Ex(Lit87, Lit59, Lit90, Lit18);
        return runtime.setAndCoerceProperty$Ex(Lit87, Lit61, Lit91, Lit18);
    }

    static Object lambda23() {
        runtime.setAndCoerceProperty$Ex(Lit87, Lit55, Lit88, Lit18);
        runtime.setAndCoerceProperty$Ex(Lit87, Lit19, Lit20, Lit18);
        runtime.setAndCoerceProperty$Ex(Lit87, Lit57, Lit89, Lit18);
        runtime.setAndCoerceProperty$Ex(Lit87, Lit59, Lit90, Lit18);
        return runtime.setAndCoerceProperty$Ex(Lit87, Lit61, Lit91, Lit18);
    }

    public Object Slider3$PositionChanged(Object $thumbPosition) {
        runtime.sanitizeComponentData($thumbPosition);
        runtime.setThisForm();
        runtime.setAndCoerceProperty$Ex(Lit64, Lit51, runtime.getProperty$1(Lit87, Lit61), Lit4);
        return runtime.callComponentMethod(Lit39, Lit65, LList.list1(runtime.callYailPrimitive(runtime.yail$Mnround, LList.list1(runtime.getProperty$1(Lit87, Lit61)), Lit93, "round")), Lit94);
    }

    static Object lambda24() {
        return runtime.setAndCoerceProperty$Ex(Lit97, Lit51, "Servo G :", Lit4);
    }

    static Object lambda25() {
        return runtime.setAndCoerceProperty$Ex(Lit97, Lit51, "Servo G :", Lit4);
    }

    static Object lambda26() {
        runtime.setAndCoerceProperty$Ex(Lit100, Lit55, Lit101, Lit18);
        runtime.setAndCoerceProperty$Ex(Lit100, Lit19, Lit20, Lit18);
        runtime.setAndCoerceProperty$Ex(Lit100, Lit57, Lit102, Lit18);
        runtime.setAndCoerceProperty$Ex(Lit100, Lit59, Lit103, Lit18);
        return runtime.setAndCoerceProperty$Ex(Lit100, Lit61, Lit104, Lit18);
    }

    static Object lambda27() {
        runtime.setAndCoerceProperty$Ex(Lit100, Lit55, Lit101, Lit18);
        runtime.setAndCoerceProperty$Ex(Lit100, Lit19, Lit20, Lit18);
        runtime.setAndCoerceProperty$Ex(Lit100, Lit57, Lit102, Lit18);
        runtime.setAndCoerceProperty$Ex(Lit100, Lit59, Lit103, Lit18);
        return runtime.setAndCoerceProperty$Ex(Lit100, Lit61, Lit104, Lit18);
    }

    public Object Slider4$PositionChanged(Object $thumbPosition) {
        runtime.sanitizeComponentData($thumbPosition);
        runtime.setThisForm();
        runtime.setAndCoerceProperty$Ex(Lit64, Lit51, runtime.getProperty$1(Lit100, Lit61), Lit4);
        return runtime.callComponentMethod(Lit39, Lit65, LList.list1(runtime.callYailPrimitive(runtime.yail$Mnround, LList.list1(runtime.getProperty$1(Lit100, Lit61)), Lit106, "round")), Lit107);
    }

    static Object lambda28() {
        return runtime.setAndCoerceProperty$Ex(Lit110, Lit51, "Bluetooth Status :", Lit4);
    }

    static Object lambda29() {
        return runtime.setAndCoerceProperty$Ex(Lit110, Lit51, "Bluetooth Status :", Lit4);
    }

    static Object lambda30() {
        return runtime.setAndCoerceProperty$Ex(Lit113, Lit19, Lit20, Lit18);
    }

    static Object lambda31() {
        return runtime.setAndCoerceProperty$Ex(Lit113, Lit19, Lit20, Lit18);
    }

    static Object lambda32() {
        return runtime.setAndCoerceProperty$Ex(Lit116, Lit51, "Slider value:", Lit4);
    }

    static Object lambda33() {
        return runtime.setAndCoerceProperty$Ex(Lit116, Lit51, "Slider value:", Lit4);
    }

    public Object Clock1$Timer() {
        runtime.setThisForm();
        if (runtime.getProperty$1(Lit39, Lit125) != Boolean.FALSE) {
            runtime.setAndCoerceProperty$Ex(Lit113, Lit51, "Connected", Lit4);
            return runtime.setAndCoerceProperty$Ex(Lit113, Lit126, Lit127, Lit18);
        }
        runtime.setAndCoerceProperty$Ex(Lit113, Lit51, "Not Connected", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit113, Lit126, Lit128, Lit18);
    }

    /* compiled from: Screen1.yail */
    public class frame extends ModuleBody {
        Screen1 $main;

        public int match1(ModuleMethod moduleMethod, Object obj, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 1:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 3:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 5:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 10:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 11:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 12:
                    if (!(obj instanceof Screen1)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 33:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 38:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 43:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 48:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                default:
                    return super.match1(moduleMethod, obj, callContext);
            }
        }

        public int match2(ModuleMethod moduleMethod, Object obj, Object obj2, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 2:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case 3:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case 6:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case 7:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case 9:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case 14:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                default:
                    return super.match2(moduleMethod, obj, obj2, callContext);
            }
        }

        public int match4(ModuleMethod moduleMethod, Object obj, Object obj2, Object obj3, Object obj4, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 8:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.value3 = obj3;
                    callContext.value4 = obj4;
                    callContext.proc = moduleMethod;
                    callContext.pc = 4;
                    return 0;
                case 13:
                    if (!(obj instanceof Screen1)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    if (!(obj2 instanceof Component)) {
                        return -786430;
                    }
                    callContext.value2 = obj2;
                    if (!(obj3 instanceof String)) {
                        return -786429;
                    }
                    callContext.value3 = obj3;
                    if (!(obj4 instanceof String)) {
                        return -786428;
                    }
                    callContext.value4 = obj4;
                    callContext.proc = moduleMethod;
                    callContext.pc = 4;
                    return 0;
                default:
                    return super.match4(moduleMethod, obj, obj2, obj3, obj4, callContext);
            }
        }

        public Object apply1(ModuleMethod moduleMethod, Object obj) {
            switch (moduleMethod.selector) {
                case 1:
                    this.$main.androidLogForm(obj);
                    return Values.empty;
                case 3:
                    try {
                        return this.$main.lookupInFormEnvironment((Symbol) obj);
                    } catch (ClassCastException e) {
                        throw new WrongType(e, "lookup-in-form-environment", 1, obj);
                    }
                case 5:
                    try {
                        return this.$main.isBoundInFormEnvironment((Symbol) obj) ? Boolean.TRUE : Boolean.FALSE;
                    } catch (ClassCastException e2) {
                        throw new WrongType(e2, "is-bound-in-form-environment", 1, obj);
                    }
                case 10:
                    this.$main.addToFormDoAfterCreation(obj);
                    return Values.empty;
                case 11:
                    this.$main.sendError(obj);
                    return Values.empty;
                case 12:
                    this.$main.processException(obj);
                    return Values.empty;
                case 33:
                    return this.$main.Slider1$PositionChanged(obj);
                case 38:
                    return this.$main.Slider2$PositionChanged(obj);
                case 43:
                    return this.$main.Slider3$PositionChanged(obj);
                case 48:
                    return this.$main.Slider4$PositionChanged(obj);
                default:
                    return super.apply1(moduleMethod, obj);
            }
        }

        public Object apply4(ModuleMethod moduleMethod, Object obj, Object obj2, Object obj3, Object obj4) {
            switch (moduleMethod.selector) {
                case 8:
                    this.$main.addToComponents(obj, obj2, obj3, obj4);
                    return Values.empty;
                case 13:
                    try {
                        try {
                            try {
                                try {
                                    return this.$main.dispatchEvent((Component) obj, (String) obj2, (String) obj3, (Object[]) obj4) ? Boolean.TRUE : Boolean.FALSE;
                                } catch (ClassCastException e) {
                                    throw new WrongType(e, "dispatchEvent", 4, obj4);
                                }
                            } catch (ClassCastException e2) {
                                throw new WrongType(e2, "dispatchEvent", 3, obj3);
                            }
                        } catch (ClassCastException e3) {
                            throw new WrongType(e3, "dispatchEvent", 2, obj2);
                        }
                    } catch (ClassCastException e4) {
                        throw new WrongType(e4, "dispatchEvent", 1, obj);
                    }
                default:
                    return super.apply4(moduleMethod, obj, obj2, obj3, obj4);
            }
        }

        public Object apply2(ModuleMethod moduleMethod, Object obj, Object obj2) {
            switch (moduleMethod.selector) {
                case 2:
                    try {
                        this.$main.addToFormEnvironment((Symbol) obj, obj2);
                        return Values.empty;
                    } catch (ClassCastException e) {
                        throw new WrongType(e, "add-to-form-environment", 1, obj);
                    }
                case 3:
                    try {
                        return this.$main.lookupInFormEnvironment((Symbol) obj, obj2);
                    } catch (ClassCastException e2) {
                        throw new WrongType(e2, "lookup-in-form-environment", 1, obj);
                    }
                case 6:
                    try {
                        this.$main.addToGlobalVarEnvironment((Symbol) obj, obj2);
                        return Values.empty;
                    } catch (ClassCastException e3) {
                        throw new WrongType(e3, "add-to-global-var-environment", 1, obj);
                    }
                case 7:
                    this.$main.addToEvents(obj, obj2);
                    return Values.empty;
                case 9:
                    this.$main.addToGlobalVars(obj, obj2);
                    return Values.empty;
                case 14:
                    return this.$main.lookupHandler(obj, obj2);
                default:
                    return super.apply2(moduleMethod, obj, obj2);
            }
        }

        public Object apply0(ModuleMethod moduleMethod) {
            switch (moduleMethod.selector) {
                case 15:
                    return Screen1.lambda2();
                case 16:
                    this.$main.$define();
                    return Values.empty;
                case 17:
                    return Screen1.lambda3();
                case 18:
                    return this.$main.Screen1$Initialize();
                case 19:
                    return Screen1.lambda4();
                case 20:
                    return Screen1.lambda5();
                case 21:
                    return Screen1.lambda6();
                case 22:
                    return Screen1.lambda7();
                case 23:
                    return Screen1.lambda8();
                case 24:
                    return Screen1.lambda9();
                case 25:
                    return Screen1.lambda10();
                case 26:
                    return Screen1.lambda11();
                case 27:
                    return this.$main.ListPicker1$BeforePicking();
                case 28:
                    return this.$main.ListPicker1$AfterPicking();
                case 29:
                    return Screen1.lambda12();
                case 30:
                    return Screen1.lambda13();
                case 31:
                    return Screen1.lambda14();
                case 32:
                    return Screen1.lambda15();
                case 34:
                    return Screen1.lambda16();
                case 35:
                    return Screen1.lambda17();
                case 36:
                    return Screen1.lambda18();
                case 37:
                    return Screen1.lambda19();
                case 39:
                    return Screen1.lambda20();
                case 40:
                    return Screen1.lambda21();
                case 41:
                    return Screen1.lambda22();
                case 42:
                    return Screen1.lambda23();
                case 44:
                    return Screen1.lambda24();
                case 45:
                    return Screen1.lambda25();
                case 46:
                    return Screen1.lambda26();
                case 47:
                    return Screen1.lambda27();
                case 49:
                    return Screen1.lambda28();
                case 50:
                    return Screen1.lambda29();
                case 51:
                    return Screen1.lambda30();
                case 52:
                    return Screen1.lambda31();
                case 53:
                    return Screen1.lambda32();
                case 54:
                    return Screen1.lambda33();
                case 55:
                    return this.$main.Clock1$Timer();
                default:
                    return super.apply0(moduleMethod);
            }
        }

        public int match0(ModuleMethod moduleMethod, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 15:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 16:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 17:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 18:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 19:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 20:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 21:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 22:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 23:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 24:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 25:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 26:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 27:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 28:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 29:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 30:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 31:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 32:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 34:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 35:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 36:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 37:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 39:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 40:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 41:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 42:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 44:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 45:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 46:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 47:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 49:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 50:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 51:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 52:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 53:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 54:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 55:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                default:
                    return super.match0(moduleMethod, callContext);
            }
        }
    }

    public void androidLogForm(Object message) {
    }

    public void addToFormEnvironment(Symbol name, Object object) {
        androidLogForm(Format.formatToString(0, "Adding ~A to env ~A with value ~A", name, this.form$Mnenvironment, object));
        this.form$Mnenvironment.put(name, object);
    }

    public Object lookupInFormEnvironment(Symbol name, Object default$Mnvalue) {
        boolean x = ((this.form$Mnenvironment == null ? 1 : 0) + 1) & true;
        if (x) {
            if (!this.form$Mnenvironment.isBound(name)) {
                return default$Mnvalue;
            }
        } else if (!x) {
            return default$Mnvalue;
        }
        return this.form$Mnenvironment.get(name);
    }

    public boolean isBoundInFormEnvironment(Symbol name) {
        return this.form$Mnenvironment.isBound(name);
    }

    public void addToGlobalVarEnvironment(Symbol name, Object object) {
        androidLogForm(Format.formatToString(0, "Adding ~A to env ~A with value ~A", name, this.global$Mnvar$Mnenvironment, object));
        this.global$Mnvar$Mnenvironment.put(name, object);
    }

    public void addToEvents(Object component$Mnname, Object event$Mnname) {
        this.events$Mnto$Mnregister = lists.cons(lists.cons(component$Mnname, event$Mnname), this.events$Mnto$Mnregister);
    }

    public void addToComponents(Object container$Mnname, Object component$Mntype, Object component$Mnname, Object init$Mnthunk) {
        this.components$Mnto$Mncreate = lists.cons(LList.list4(container$Mnname, component$Mntype, component$Mnname, init$Mnthunk), this.components$Mnto$Mncreate);
    }

    public void addToGlobalVars(Object var, Object val$Mnthunk) {
        this.global$Mnvars$Mnto$Mncreate = lists.cons(LList.list2(var, val$Mnthunk), this.global$Mnvars$Mnto$Mncreate);
    }

    public void addToFormDoAfterCreation(Object thunk) {
        this.form$Mndo$Mnafter$Mncreation = lists.cons(thunk, this.form$Mndo$Mnafter$Mncreation);
    }

    public void sendError(Object error) {
        RetValManager.sendError(error == null ? null : error.toString());
    }

    public void processException(Object ex) {
        Object apply1 = Scheme.applyToArgs.apply1(GetNamedPart.getNamedPart.apply2(ex, Lit1));
        RuntimeErrorAlert.alert(this, apply1 == null ? null : apply1.toString(), ex instanceof YailRuntimeError ? ((YailRuntimeError) ex).getErrorType() : "Runtime Error", "End Application");
    }

    public boolean dispatchEvent(Component componentObject, String registeredComponentName, String eventName, Object[] args) {
        SimpleSymbol registeredObject = misc.string$To$Symbol(registeredComponentName);
        if (!isBoundInFormEnvironment(registeredObject)) {
            EventDispatcher.unregisterEventForDelegation(this, registeredComponentName, eventName);
            return false;
        } else if (lookupInFormEnvironment(registeredObject) != componentObject) {
            return false;
        } else {
            try {
                Scheme.apply.apply2(lookupHandler(registeredComponentName, eventName), LList.makeList(args, 0));
                return true;
            } catch (Throwable exception) {
                androidLogForm(exception.getMessage());
                exception.printStackTrace();
                processException(exception);
                return false;
            }
        }
    }

    public Object lookupHandler(Object componentName, Object eventName) {
        String str = null;
        String obj = componentName == null ? null : componentName.toString();
        if (eventName != null) {
            str = eventName.toString();
        }
        return lookupInFormEnvironment(misc.string$To$Symbol(EventDispatcher.makeFullEventName(obj, str)));
    }

    public void $define() {
        Object reverse;
        Object reverse2;
        Object obj;
        Object obj2;
        Object obj3;
        Object component$Mnname;
        Object obj4;
        Object var;
        Language.setDefaults(Scheme.getInstance());
        try {
            run();
        } catch (Exception exception) {
            androidLogForm(exception.getMessage());
            processException(exception);
        }
        Screen1 = this;
        addToFormEnvironment(Lit0, this);
        Object obj5 = this.events$Mnto$Mnregister;
        while (obj5 != LList.Empty) {
            try {
                Pair arg0 = (Pair) obj5;
                Object event$Mninfo = arg0.getCar();
                Object apply1 = lists.car.apply1(event$Mninfo);
                String obj6 = apply1 == null ? null : apply1.toString();
                Object apply12 = lists.cdr.apply1(event$Mninfo);
                EventDispatcher.registerEventForDelegation(this, obj6, apply12 == null ? null : apply12.toString());
                obj5 = arg0.getCdr();
            } catch (ClassCastException e) {
                throw new WrongType(e, "arg0", -2, obj5);
            }
        }
        try {
            addToGlobalVars(Lit2, lambda$Fn1);
            reverse = lists.reverse(this.global$Mnvars$Mnto$Mncreate);
            while (reverse != LList.Empty) {
                Pair arg02 = (Pair) reverse;
                Object var$Mnval = arg02.getCar();
                var = lists.car.apply1(var$Mnval);
                addToGlobalVarEnvironment((Symbol) var, Scheme.applyToArgs.apply1(lists.cadr.apply1(var$Mnval)));
                reverse = arg02.getCdr();
            }
            reverse2 = lists.reverse(this.form$Mndo$Mnafter$Mncreation);
            while (reverse2 != LList.Empty) {
                Pair arg03 = (Pair) reverse2;
                misc.force(arg03.getCar());
                reverse2 = arg03.getCdr();
            }
            LList component$Mndescriptors = lists.reverse(this.components$Mnto$Mncreate);
            obj = component$Mndescriptors;
            while (obj != LList.Empty) {
                Pair arg04 = (Pair) obj;
                Object component$Mninfo = arg04.getCar();
                component$Mnname = lists.caddr.apply1(component$Mninfo);
                lists.cadddr.apply1(component$Mninfo);
                Object component$Mnobject = Invoke.make.apply2(lists.cadr.apply1(component$Mninfo), lookupInFormEnvironment((Symbol) lists.car.apply1(component$Mninfo)));
                SlotSet.set$Mnfield$Ex.apply3(this, component$Mnname, component$Mnobject);
                addToFormEnvironment((Symbol) component$Mnname, component$Mnobject);
                obj = arg04.getCdr();
            }
            obj2 = component$Mndescriptors;
            while (obj2 != LList.Empty) {
                Pair arg05 = (Pair) obj2;
                Object component$Mninfo2 = arg05.getCar();
                lists.caddr.apply1(component$Mninfo2);
                Object init$Mnthunk = lists.cadddr.apply1(component$Mninfo2);
                if (init$Mnthunk != Boolean.FALSE) {
                    Scheme.applyToArgs.apply1(init$Mnthunk);
                }
                obj2 = arg05.getCdr();
            }
            obj3 = component$Mndescriptors;
            while (obj3 != LList.Empty) {
                Pair arg06 = (Pair) obj3;
                Object component$Mninfo3 = arg06.getCar();
                Object component$Mnname2 = lists.caddr.apply1(component$Mninfo3);
                lists.cadddr.apply1(component$Mninfo3);
                callInitialize(SlotGet.field.apply2(this, component$Mnname2));
                obj3 = arg06.getCdr();
            }
        } catch (ClassCastException e2) {
            throw new WrongType(e2, "arg0", -2, obj3);
        } catch (ClassCastException e3) {
            throw new WrongType(e3, "arg0", -2, obj2);
        } catch (ClassCastException e4) {
            throw new WrongType(e4, "add-to-form-environment", 0, component$Mnname);
        } catch (ClassCastException e5) {
            throw new WrongType(e5, "lookup-in-form-environment", 0, obj4);
        } catch (ClassCastException e6) {
            throw new WrongType(e6, "arg0", -2, obj);
        } catch (ClassCastException e7) {
            throw new WrongType(e7, "arg0", -2, reverse2);
        } catch (ClassCastException e8) {
            throw new WrongType(e8, "add-to-global-var-environment", 0, var);
        } catch (ClassCastException e9) {
            throw new WrongType(e9, "arg0", -2, reverse);
        } catch (YailRuntimeError exception2) {
            processException(exception2);
        }
    }

    public static SimpleSymbol lambda1symbolAppend$V(Object[] argsArray) {
        LList symbols = LList.makeList(argsArray, 0);
        Apply apply = Scheme.apply;
        ModuleMethod moduleMethod = strings.string$Mnappend;
        Object obj = LList.Empty;
        LList lList = symbols;
        while (lList != LList.Empty) {
            try {
                Pair arg0 = (Pair) lList;
                Object arg02 = arg0.getCdr();
                Object car = arg0.getCar();
                try {
                    obj = Pair.make(misc.symbol$To$String((Symbol) car), obj);
                    lList = arg02;
                } catch (ClassCastException e) {
                    throw new WrongType(e, "symbol->string", 1, car);
                }
            } catch (ClassCastException e2) {
                throw new WrongType(e2, "arg0", -2, lList);
            }
        }
        Object apply2 = apply.apply2(moduleMethod, LList.reverseInPlace(obj));
        try {
            return misc.string$To$Symbol((CharSequence) apply2);
        } catch (ClassCastException e3) {
            throw new WrongType(e3, "string->symbol", 1, apply2);
        }
    }

    static Object lambda2() {
        return null;
    }
}
