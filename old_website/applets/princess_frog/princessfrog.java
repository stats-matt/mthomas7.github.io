import org.python.core.*;

public class princessfrog extends java.lang.Object {
    static String[] jpy$mainProperties = new String[] {"python.modules.builtin", "exceptions:org.python.core.exceptions"};
    static String[] jpy$proxyProperties = new String[] {"python.modules.builtin", "exceptions:org.python.core.exceptions", "python.options.showJavaExceptions", "true"};
    static String[] jpy$packages = new String[] {"java.applet", null, "java.util", null, "java.awt.event", null};
    
    public static class _PyInner extends PyFunctionTable implements PyRunnable {
        private static PyObject i$0;
        private static PyObject i$1;
        private static PyObject s$2;
        private static PyObject s$3;
        private static PyObject s$4;
        private static PyObject s$5;
        private static PyObject i$6;
        private static PyObject s$7;
        private static PyObject i$8;
        private static PyObject s$9;
        private static PyObject i$10;
        private static PyObject i$11;
        private static PyObject i$12;
        private static PyObject i$13;
        private static PyObject i$14;
        private static PyObject i$15;
        private static PyObject i$16;
        private static PyObject i$17;
        private static PyObject s$18;
        private static PyObject s$19;
        private static PyObject s$20;
        private static PyFunctionTable funcTable;
        private static PyCode c$0_init;
        private static PyCode c$1_compute;
        private static PyCode c$2_ButtonDemo;
        private static PyCode c$3_main;
        private static void initConstants() {
            i$0 = Py.newInteger(2);
            i$1 = Py.newInteger(8);
            s$2 = Py.newString("Total Population");
            s$3 = Py.newString("Number to Dismiss");
            s$4 = Py.newString("GO");
            s$5 = Py.newString("Scores");
            i$6 = Py.newInteger(40);
            s$7 = Py.newString("Your Choice");
            i$8 = Py.newInteger(30);
            s$9 = Py.newString("Highest Possible");
            i$10 = Py.newInteger(50);
            i$11 = Py.newInteger(0);
            i$12 = Py.newInteger(1);
            i$13 = Py.newInteger(4);
            i$14 = Py.newInteger(5);
            i$15 = Py.newInteger(6);
            i$16 = Py.newInteger(7);
            i$17 = Py.newInteger(9);
            s$18 = Py.newString("");
            s$19 = Py.newString(" , ");
            s$20 = Py.newString("/home/mthomas/Desktop/princessfrog.py");
            funcTable = new _PyInner();
            c$0_init = Py.newCode(1, new String[] {"self", "bag"}, "/home/mthomas/Desktop/princessfrog.py", "init", false, false, funcTable, 0, null, null, 0, 17);
            c$1_compute = Py.newCode(2, new String[] {"self", "event", "number", "i", "h", "finalchoice", "dismissed", "firsthigh", "x"}, "/home/mthomas/Desktop/princessfrog.py", "compute", false, false, funcTable, 1, null, null, 0, 17);
            c$2_ButtonDemo = Py.newCode(0, new String[] {}, "/home/mthomas/Desktop/princessfrog.py", "ButtonDemo", false, false, funcTable, 2, null, null, 0, 16);
            c$3_main = Py.newCode(0, new String[] {}, "/home/mthomas/Desktop/princessfrog.py", "main", false, false, funcTable, 3, null, null, 0, 16);
        }
        
        
        public PyCode getMain() {
            if (c$3_main == null) _PyInner.initConstants();
            return c$3_main;
        }
        
        public PyObject call_function(int index, PyFrame frame) {
            switch (index){
                case 0:
                return _PyInner.init$1(frame);
                case 1:
                return _PyInner.compute$2(frame);
                case 2:
                return _PyInner.ButtonDemo$3(frame);
                case 3:
                return _PyInner.main$4(frame);
                default:
                return null;
            }
        }
        
        private static PyObject init$1(PyFrame frame) {
            frame.getlocal(0).__setattr__("popbox", frame.getglobal("awt").__getattr__("TextArea").__call__(i$0, i$1));
            frame.getlocal(0).__setattr__("pop", frame.getglobal("awt").__getattr__("Label").__call__(s$2));
            frame.getlocal(0).__setattr__("dismiss", frame.getglobal("awt").__getattr__("Label").__call__(s$3));
            frame.getlocal(0).__setattr__("dismissbox", frame.getglobal("awt").__getattr__("TextArea").__call__(i$0, i$1));
            frame.getlocal(0).__setattr__("button", frame.getglobal("awt").__getattr__("Button").__call__(s$4));
            frame.getlocal(0).__setattr__("scoreslabel", frame.getglobal("awt").__getattr__("Label").__call__(s$5));
            frame.getlocal(0).__setattr__("scores", frame.getglobal("awt").__getattr__("TextArea").__call__(i$0, i$6));
            frame.getlocal(0).__setattr__("yourchoicelabel", frame.getglobal("awt").__getattr__("Label").__call__(s$7));
            frame.getlocal(0).__setattr__("yourchoice", frame.getglobal("awt").__getattr__("TextArea").__call__(i$0, i$8));
            frame.getlocal(0).__setattr__("highlabel", frame.getglobal("awt").__getattr__("Label").__call__(s$9));
            frame.getlocal(0).__setattr__("high", frame.getglobal("awt").__getattr__("TextArea").__call__(i$0, i$8));
            frame.getlocal(0).__setattr__("test", frame.getglobal("awt").__getattr__("TextArea").__call__(i$0, i$10));
            frame.getlocal(0).__getattr__("button").__setattr__("actionPerformed", frame.getlocal(0).__getattr__("compute"));
            frame.setlocal(1, frame.getglobal("GridBag").__call__(frame.getlocal(0)));
            frame.getlocal(1).__getattr__("add").__call__(new PyObject[] {frame.getlocal(0).__getattr__("pop"), i$11, i$11}, new String[] {"gridx", "gridy"});
            frame.getlocal(1).__getattr__("add").__call__(new PyObject[] {frame.getlocal(0).__getattr__("popbox"), i$12, i$11}, new String[] {"gridx", "gridy"});
            frame.getlocal(1).__getattr__("add").__call__(new PyObject[] {frame.getlocal(0).__getattr__("dismiss"), i$11, i$0}, new String[] {"gridx", "gridy"});
            frame.getlocal(1).__getattr__("add").__call__(new PyObject[] {frame.getlocal(0).__getattr__("dismissbox"), i$12, i$0}, new String[] {"gridx", "gridy"});
            frame.getlocal(1).__getattr__("add").__call__(new PyObject[] {frame.getlocal(0).__getattr__("button"), i$11, i$13, i$0}, new String[] {"gridx", "gridy", "gridwidth"});
            frame.getlocal(1).__getattr__("add").__call__(new PyObject[] {frame.getlocal(0).__getattr__("scoreslabel"), i$11, i$14}, new String[] {"gridx", "gridy"});
            frame.getlocal(1).__getattr__("add").__call__(new PyObject[] {frame.getlocal(0).__getattr__("scores"), i$11, i$15, i$0}, new String[] {"gridx", "gridy", "gridwidth"});
            frame.getlocal(1).__getattr__("add").__call__(new PyObject[] {frame.getlocal(0).__getattr__("yourchoicelabel"), i$11, i$16}, new String[] {"gridx", "gridy"});
            frame.getlocal(1).__getattr__("add").__call__(new PyObject[] {frame.getlocal(0).__getattr__("yourchoice"), i$12, i$16}, new String[] {"gridx", "gridy"});
            frame.getlocal(1).__getattr__("add").__call__(new PyObject[] {frame.getlocal(0).__getattr__("highlabel"), i$11, i$1}, new String[] {"gridx", "gridy"});
            frame.getlocal(1).__getattr__("add").__call__(new PyObject[] {frame.getlocal(0).__getattr__("high"), i$12, i$1}, new String[] {"gridx", "gridy"});
            frame.getlocal(1).__getattr__("add").__call__(new PyObject[] {frame.getlocal(0).__getattr__("test"), i$11, i$17, i$0}, new String[] {"gridx", "gridy", "gridwidth"});
            return Py.None;
        }
        
        private static PyObject compute$2(PyFrame frame) {
            // Temporary Variables
            PyObject t$0$PyObject, t$1$PyObject, t$2$PyObject, t$3$PyObject;
            
            // Code
            frame.setlocal(2, frame.getglobal("int").__call__(frame.getlocal(0).__getattr__("popbox").invoke("getText")));
            frame.setlocal(6, frame.getglobal("int").__call__(frame.getlocal(0).__getattr__("dismissbox").invoke("getText")));
            frame.getlocal(0).__getattr__("scores").invoke("setText", s$18);
            frame.getlocal(0).__setattr__("scorelist", new PyList(new PyObject[] {}));
            t$0$PyObject = frame.getglobal("range").__call__(frame.getlocal(2)).__iter__();
            while ((t$1$PyObject = t$0$PyObject.__iternext__()) != null) {
                frame.setlocal(3, t$1$PyObject);
                frame.setlocal(8, frame.getglobal("Random").__call__());
                frame.setlocal(8, frame.getlocal(8).invoke("nextFloat"));
                frame.getlocal(0).__getattr__("scores").invoke("append", frame.getglobal("str").__call__(frame.getlocal(8))._add(s$19));
                frame.getlocal(0).__getattr__("scorelist").invoke("append", frame.getlocal(8));
            }
            frame.getlocal(0).__setattr__("sortlist", frame.getlocal(0).__getattr__("scorelist").__getslice__(null, null, null));
            frame.getlocal(0).__getattr__("sortlist").invoke("sort");
            frame.setlocal(4, frame.getlocal(0).__getattr__("sortlist").__getitem__(i$12.__neg__()));
            frame.getlocal(0).__getattr__("high").invoke("setText", frame.getglobal("str").__call__(frame.getlocal(4)));
            frame.getlocal(0).__setattr__("firstscores", frame.getlocal(0).__getattr__("scorelist").__getslice__(null, frame.getlocal(6), null));
            frame.getlocal(0).__setattr__("lastscores", frame.getlocal(0).__getattr__("scorelist").__getslice__(frame.getlocal(6), null, null));
            frame.setlocal(5, frame.getlocal(0).__getattr__("lastscores").__getitem__(i$12.__neg__()));
            frame.getlocal(0).__getattr__("firstscores").invoke("sort");
            frame.setlocal(7, frame.getlocal(0).__getattr__("firstscores").__getitem__(i$12.__neg__()));
            frame.setlocal(5, frame.getlocal(0).__getattr__("lastscores").__getitem__(i$12.__neg__()));
            frame.getlocal(0).__getattr__("yourchoice").invoke("setText", frame.getglobal("str").__call__(frame.getlocal(5)));
            frame.getlocal(0).__getattr__("test").invoke("setText", s$18);
            t$2$PyObject = frame.getlocal(0).__getattr__("lastscores").__iter__();
            while ((t$3$PyObject = t$2$PyObject.__iternext__()) != null) {
                frame.setlocal(3, t$3$PyObject);
                frame.getlocal(0).__getattr__("test").invoke("append", frame.getglobal("str").__call__(frame.getlocal(3)));
                if (frame.getlocal(3)._gt(frame.getlocal(7)).__nonzero__()) {
                    frame.setlocal(5, frame.getlocal(3));
                    frame.getlocal(0).__getattr__("yourchoice").invoke("setText", frame.getglobal("str").__call__(frame.getlocal(5)));
                    break;
                }
            }
            return Py.None;
        }
        
        private static PyObject ButtonDemo$3(PyFrame frame) {
            frame.setlocal("init", new PyFunction(frame.f_globals, new PyObject[] {}, c$0_init));
            frame.setlocal("compute", new PyFunction(frame.f_globals, new PyObject[] {}, c$1_compute));
            return frame.getf_locals();
        }
        
        private static PyObject main$4(PyFrame frame) {
            frame.setglobal("__file__", s$20);
            
            // Temporary Variables
            PyObject[] t$0$PyObject__;
            
            // Code
            t$0$PyObject__ = org.python.core.imp.importFrom("java", new String[] {"awt", "applet"}, frame);
            frame.setlocal("awt", t$0$PyObject__[0]);
            frame.setlocal("applet", t$0$PyObject__[1]);
            t$0$PyObject__ = null;
            t$0$PyObject__ = org.python.core.imp.importFrom("pawt", new String[] {"GridBag"}, frame);
            frame.setlocal("GridBag", t$0$PyObject__[0]);
            t$0$PyObject__ = null;
            t$0$PyObject__ = org.python.core.imp.importFrom("java.awt.event", new String[] {"ActionListener", "ItemListener", "AdjustmentListener"}, frame);
            frame.setlocal("ActionListener", t$0$PyObject__[0]);
            frame.setlocal("ItemListener", t$0$PyObject__[1]);
            frame.setlocal("AdjustmentListener", t$0$PyObject__[2]);
            t$0$PyObject__ = null;
            t$0$PyObject__ = org.python.core.imp.importFrom("java.util", new String[] {"Random"}, frame);
            frame.setlocal("Random", t$0$PyObject__[0]);
            t$0$PyObject__ = null;
            frame.setlocal("ButtonDemo", Py.makeClass("ButtonDemo", new PyObject[] {frame.getname("applet").__getattr__("Applet")}, c$2_ButtonDemo, null, ButtonDemo.class));
            return Py.None;
        }
        
    }
    public static class ButtonDemo extends java.applet.Applet implements org.python.core.PyProxy, org.python.core.ClassDictInit {
        public void addImpl(java.awt.Component arg0, java.lang.Object arg1, int arg2) {
            super.addImpl(arg0, arg1, arg2);
        }
        
        public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
            return super.clone();
        }
        
        public java.awt.AWTEvent coalesceEvents(java.awt.AWTEvent arg0, java.awt.AWTEvent arg1) {
            return super.coalesceEvents(arg0, arg1);
        }
        
        public void super__disableEvents(long arg0) {
            super.disableEvents(arg0);
        }
        
        public void super__enableEvents(long arg0) {
            super.enableEvents(arg0);
        }
        
        public void finalize() throws java.lang.Throwable {
            super.finalize();
        }
        
        public void firePropertyChange(java.lang.String arg0, java.lang.Object arg1, java.lang.Object arg2) {
            super.firePropertyChange(arg0, arg1, arg2);
        }
        
        public void firePropertyChange(java.lang.String arg0, int arg1, int arg2) {
            super.firePropertyChange(arg0, arg1, arg2);
        }
        
        public void firePropertyChange(java.lang.String arg0, boolean arg1, boolean arg2) {
            super.firePropertyChange(arg0, arg1, arg2);
        }
        
        public void super__init() {
            super.init();
        }
        
        public void init() {
            PyObject inst = Py.jfindattr(this, "init");
            if (inst != null) inst._jcall(new Object[] {});
            else super.init();
        }
        
        public java.lang.String paramString() {
            return super.paramString();
        }
        
        public void processComponentEvent(java.awt.event.ComponentEvent arg0) {
            super.processComponentEvent(arg0);
        }
        
        public void processContainerEvent(java.awt.event.ContainerEvent arg0) {
            super.processContainerEvent(arg0);
        }
        
        public void processEvent(java.awt.AWTEvent arg0) {
            super.processEvent(arg0);
        }
        
        public void processFocusEvent(java.awt.event.FocusEvent arg0) {
            super.processFocusEvent(arg0);
        }
        
        public void processHierarchyBoundsEvent(java.awt.event.HierarchyEvent arg0) {
            super.processHierarchyBoundsEvent(arg0);
        }
        
        public void processHierarchyEvent(java.awt.event.HierarchyEvent arg0) {
            super.processHierarchyEvent(arg0);
        }
        
        public void processInputMethodEvent(java.awt.event.InputMethodEvent arg0) {
            super.processInputMethodEvent(arg0);
        }
        
        public void processKeyEvent(java.awt.event.KeyEvent arg0) {
            super.processKeyEvent(arg0);
        }
        
        public void processMouseEvent(java.awt.event.MouseEvent arg0) {
            super.processMouseEvent(arg0);
        }
        
        public void processMouseMotionEvent(java.awt.event.MouseEvent arg0) {
            super.processMouseMotionEvent(arg0);
        }
        
        public void processMouseWheelEvent(java.awt.event.MouseWheelEvent arg0) {
            super.processMouseWheelEvent(arg0);
        }
        
        public boolean requestFocus(boolean arg0) {
            return super.requestFocus(arg0);
        }
        
        public boolean requestFocusInWindow(boolean arg0) {
            return super.requestFocusInWindow(arg0);
        }
        
        public void validateTree() {
            super.validateTree();
        }
        
        public ButtonDemo() throws java.awt.HeadlessException {
            super();
            __initProxy__(new Object[] {});
        }
        
        private PyInstance __proxy;
        public void _setPyInstance(PyInstance inst) {
            __proxy = inst;
        }
        
        public PyInstance _getPyInstance() {
            return __proxy;
        }
        
        private PySystemState __sysstate;
        public void _setPySystemState(PySystemState inst) {
            __sysstate = inst;
        }
        
        public PySystemState _getPySystemState() {
            return __sysstate;
        }
        
        public void __initProxy__(Object[] args) {
            Py.initProxy(this, "princessfrog", "ButtonDemo", args, princessfrog.jpy$packages, princessfrog.jpy$proxyProperties, "", new String[] {"pawt.__init__", "princessfrog"});
        }
        
        static public void classDictInit(PyObject dict) {
            dict.__setitem__("__supernames__", Py.java2py(new String[] {"processInputMethodEvent", "finalize", "requestFocus", "firePropertyChange", "processMouseWheelEvent", "processEvent", "processComponentEvent", "paramString", "coalesceEvents", "requestFocusInWindow", "super__disableEvents", "super__enableEvents", "processMouseEvent", "processKeyEvent", "addImpl", "validateTree", "super__init", "processHierarchyBoundsEvent", "processMouseMotionEvent", "clone", "processContainerEvent", "processFocusEvent", "processHierarchyEvent"}));
        }
        
    }
    public static void moduleDictInit(PyObject dict) {
        dict.__setitem__("__name__", new PyString("princessfrog"));
        Py.runCode(new _PyInner().getMain(), dict, dict);
    }
    
    public static void main(String[] args) throws java.lang.Exception {
        String[] newargs = new String[args.length+1];
        newargs[0] = "princessfrog";
        java.lang.System.arraycopy(args, 0, newargs, 1, args.length);
        Py.runMain(princessfrog._PyInner.class, newargs, princessfrog.jpy$packages, princessfrog.jpy$mainProperties, "", new String[] {"pawt.__init__", "princessfrog"});
    }
    
}
