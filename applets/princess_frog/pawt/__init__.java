package pawt;

import org.python.core.*;

public class __init__ extends java.lang.Object {
    static String[] jpy$mainProperties = new String[] {"python.modules.builtin", "exceptions:org.python.core.exceptions"};
    static String[] jpy$proxyProperties = new String[] {"python.modules.builtin", "exceptions:org.python.core.exceptions", "python.options.showJavaExceptions", "true"};
    static String[] jpy$packages = new String[] {"java.applet", null, "java.util", null, "java.awt.event", null};
    
    public static class _PyInner extends PyFunctionTable implements PyRunnable {
        private static PyObject i$0;
        private static PyObject s$1;
        private static PyObject s$2;
        private static PyObject i$3;
        private static PyObject s$4;
        private static PyObject s$5;
        private static PyObject s$6;
        private static PyObject s$7;
        private static PyObject s$8;
        private static PyFunctionTable funcTable;
        private static PyCode c$0_lambda;
        private static PyCode c$1_test;
        private static PyCode c$2___init__;
        private static PyCode c$3_addRow;
        private static PyCode c$4_add;
        private static PyCode c$5_GridBag;
        private static PyCode c$6_main;
        private static void initConstants() {
            i$0 = Py.newInteger(0);
            s$1 = Py.newString("init");
            s$2 = Py.newString("Center");
            i$3 = Py.newInteger(1);
            s$4 = Py.newString("AWT Tester");
            s$5 = Py.newString("REMAINDER");
            s$6 = Py.newString("gridwidth");
            s$7 = Py.newString("");
            s$8 = Py.newString("/usr/share/jython/Lib/pawt/__init__.py");
            funcTable = new _PyInner();
            c$0_lambda = Py.newCode(1, new String[] {"event"}, "/usr/share/jython/Lib/pawt/__init__.py", "<lambda>", false, false, funcTable, 0, null, null, 0, 17);
            c$1_test = Py.newCode(3, new String[] {"panel", "size", "name", "f"}, "/usr/share/jython/Lib/pawt/__init__.py", "test", false, false, funcTable, 1, null, null, 0, 17);
            c$2___init__ = Py.newCode(3, new String[] {"self", "frame", "defaults"}, "/usr/share/jython/Lib/pawt/__init__.py", "__init__", false, true, funcTable, 2, null, null, 0, 17);
            c$3_addRow = Py.newCode(3, new String[] {"self", "widget", "kw"}, "/usr/share/jython/Lib/pawt/__init__.py", "addRow", false, true, funcTable, 3, null, null, 0, 17);
            c$4_add = Py.newCode(3, new String[] {"self", "widget", "kw", "constraints", "value", "key"}, "/usr/share/jython/Lib/pawt/__init__.py", "add", false, true, funcTable, 4, null, null, 0, 17);
            c$5_GridBag = Py.newCode(0, new String[] {}, "/usr/share/jython/Lib/pawt/__init__.py", "GridBag", false, false, funcTable, 5, null, null, 0, 16);
            c$6_main = Py.newCode(0, new String[] {}, "/usr/share/jython/Lib/pawt/__init__.py", "main", false, false, funcTable, 6, null, null, 0, 16);
        }
        
        
        public PyCode getMain() {
            if (c$6_main == null) _PyInner.initConstants();
            return c$6_main;
        }
        
        public PyObject call_function(int index, PyFrame frame) {
            switch (index){
                case 0:
                return _PyInner.lambda$1(frame);
                case 1:
                return _PyInner.test$2(frame);
                case 2:
                return _PyInner.__init__$3(frame);
                case 3:
                return _PyInner.addRow$4(frame);
                case 4:
                return _PyInner.add$5(frame);
                case 5:
                return _PyInner.GridBag$6(frame);
                case 6:
                return _PyInner.main$7(frame);
                default:
                return null;
            }
        }
        
        private static PyObject lambda$1(PyFrame frame) {
            return frame.getglobal("sys").__getattr__("exit").__call__(i$0);
        }
        
        private static PyObject test$2(PyFrame frame) {
            frame.setlocal(3, frame.getglobal("awt").__getattr__("Frame").__call__(new PyObject[] {frame.getlocal(2), new PyFunction(frame.f_globals, new PyObject[] {}, c$0_lambda)}, new String[] {"windowClosing"}));
            if (frame.getglobal("hasattr").__call__(frame.getlocal(0), s$1).__nonzero__()) {
                frame.getlocal(0).invoke("init");
            }
            frame.getlocal(3).invoke("add", s$2, frame.getlocal(0));
            frame.getlocal(3).invoke("pack");
            if (frame.getlocal(1)._isnot(frame.getglobal("None")).__nonzero__()) {
                frame.getlocal(3).invoke("setSize", frame.getglobal("apply").__call__(frame.getglobal("awt").__getattr__("Dimension"), frame.getlocal(1)));
            }
            frame.getlocal(3).invoke("setVisible", i$3);
            return frame.getlocal(3);
        }
        
        private static PyObject __init__$3(PyFrame frame) {
            frame.getlocal(0).__setattr__("frame", frame.getlocal(1));
            frame.getlocal(0).__setattr__("gridbag", frame.getglobal("awt").__getattr__("GridBagLayout").__call__());
            frame.getlocal(0).__setattr__("defaults", frame.getlocal(2));
            frame.getlocal(1).invoke("setLayout", frame.getlocal(0).__getattr__("gridbag"));
            return Py.None;
        }
        
        private static PyObject addRow$4(PyFrame frame) {
            frame.getlocal(2).__setitem__(s$6, s$5);
            frame.getglobal("apply").__call__(frame.getlocal(0).__getattr__("add"), new PyTuple(new PyObject[] {frame.getlocal(1)}), frame.getlocal(2));
            return Py.None;
        }
        
        private static PyObject add$5(PyFrame frame) {
            // Temporary Variables
            PyObject[] t$0$PyObject__;
            PyObject t$0$PyObject, t$1$PyObject;
            
            // Code
            frame.setlocal(3, frame.getglobal("awt").__getattr__("GridBagConstraints").__call__());
            t$0$PyObject = frame.getlocal(0).__getattr__("defaults").invoke("items")._add(frame.getlocal(2).invoke("items")).__iter__();
            while ((t$1$PyObject = t$0$PyObject.__iternext__()) != null) {
                t$0$PyObject__ = org.python.core.Py.unpackSequence(t$1$PyObject, 2);
                frame.setlocal(5, t$0$PyObject__[0]);
                frame.setlocal(4, t$0$PyObject__[1]);
                if (frame.getglobal("isinstance").__call__(frame.getlocal(4), frame.getglobal("type").__call__(s$7)).__nonzero__()) {
                    frame.setlocal(4, frame.getglobal("getattr").__call__(frame.getglobal("awt").__getattr__("GridBagConstraints"), frame.getlocal(4)));
                }
                frame.getglobal("setattr").__call__(frame.getlocal(3), frame.getlocal(5), frame.getlocal(4));
            }
            frame.getlocal(0).__getattr__("gridbag").invoke("setConstraints", frame.getlocal(1), frame.getlocal(3));
            frame.getlocal(0).__getattr__("frame").invoke("add", frame.getlocal(1));
            return Py.None;
        }
        
        private static PyObject GridBag$6(PyFrame frame) {
            frame.setlocal("__init__", new PyFunction(frame.f_globals, new PyObject[] {}, c$2___init__));
            frame.setlocal("addRow", new PyFunction(frame.f_globals, new PyObject[] {}, c$3_addRow));
            frame.setlocal("add", new PyFunction(frame.f_globals, new PyObject[] {}, c$4_add));
            return frame.getf_locals();
        }
        
        private static PyObject main$7(PyFrame frame) {
            frame.setglobal("__file__", s$8);
            
            // Temporary Variables
            PyObject[] t$0$PyObject__;
            
            // Code
            frame.setlocal("sys", org.python.core.imp.importOne("sys", frame));
            t$0$PyObject__ = org.python.core.imp.importFrom("java", new String[] {"awt"}, frame);
            frame.setlocal("awt", t$0$PyObject__[0]);
            t$0$PyObject__ = null;
            frame.setlocal("test", new PyFunction(frame.f_globals, new PyObject[] {frame.getname("None"), s$4}, c$1_test));
            frame.setlocal("GridBag", Py.makeClass("GridBag", new PyObject[] {}, c$5_GridBag, null));
            return Py.None;
        }
        
    }
    public static void moduleDictInit(PyObject dict) {
        dict.__setitem__("__name__", new PyString("__init__"));
        Py.runCode(new _PyInner().getMain(), dict, dict);
    }
    
    public static void main(String[] args) throws java.lang.Exception {
        String[] newargs = new String[args.length+1];
        newargs[0] = "__init__";
        java.lang.System.arraycopy(args, 0, newargs, 1, args.length);
        Py.runMain(pawt.__init__._PyInner.class, newargs, __init__.jpy$packages, __init__.jpy$mainProperties, "pawt", new String[] {"pawt.__init__", "princessfrog"});
    }
    
}
