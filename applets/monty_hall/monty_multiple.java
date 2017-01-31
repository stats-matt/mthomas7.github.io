import org.python.core.*;

public class monty_multiple extends java.lang.Object {
    static String[] jpy$mainProperties = new String[] {"python.modules.builtin", "exceptions:org.python.core.exceptions"};
    static String[] jpy$proxyProperties = new String[] {"python.modules.builtin", "exceptions:org.python.core.exceptions", "python.options.showJavaExceptions", "true"};
    static String[] jpy$packages = new String[] {"java.applet", null, "java.util", null, "java.awt.event", null};
    
    public static class _PyInner extends PyFunctionTable implements PyRunnable {
        private static PyObject s$0;
        private static PyObject s$1;
        private static PyObject i$2;
        private static PyObject i$3;
        private static PyObject s$4;
        private static PyObject i$5;
        private static PyObject i$6;
        private static PyObject s$7;
        private static PyObject s$8;
        private static PyObject s$9;
        private static PyObject s$10;
        private static PyObject i$11;
        private static PyObject i$12;
        private static PyObject i$13;
        private static PyObject i$14;
        private static PyObject i$15;
        private static PyObject i$16;
        private static PyObject i$17;
        private static PyObject s$18;
        private static PyObject i$19;
        private static PyObject s$20;
        private static PyObject s$21;
        private static PyObject s$22;
        private static PyObject s$23;
        private static PyFunctionTable funcTable;
        private static PyCode c$0_init;
        private static PyCode c$1_run_switch;
        private static PyCode c$2_run_stay;
        private static PyCode c$3_switch;
        private static PyCode c$4_stay;
        private static PyCode c$5_MontyHall_multiple;
        private static PyCode c$6_main;
        private static void initConstants() {
            s$0 = Py.newString("Switch");
            s$1 = Py.newString("Stay");
            i$2 = Py.newInteger(2);
            i$3 = Py.newInteger(8);
            s$4 = Py.newString("Choose A Number of Trials and Whether to Switch or Stay");
            i$5 = Py.newInteger(20);
            i$6 = Py.newInteger(10);
            s$7 = Py.newString("Number of Wins:");
            s$8 = Py.newString("Number of Losses:");
            s$9 = Py.newString("Percent Wins:");
            s$10 = Py.newString("Percent Losses:");
            i$11 = Py.newInteger(0);
            i$12 = Py.newInteger(1);
            i$13 = Py.newInteger(3);
            i$14 = Py.newInteger(4);
            i$15 = Py.newInteger(5);
            i$16 = Py.newInteger(6);
            i$17 = Py.newInteger(7);
            s$18 = Py.newString(" ");
            i$19 = Py.newInteger(100);
            s$20 = Py.newString("%");
            s$21 = Py.newString("lose, ");
            s$22 = Py.newString("win, ");
            s$23 = Py.newString("/media/Almond/jython/monty_multiple.py");
            funcTable = new _PyInner();
            c$0_init = Py.newCode(1, new String[] {"self", "bag"}, "/media/Almond/jython/monty_multiple.py", "init", false, false, funcTable, 0, null, null, 0, 17);
            c$1_run_switch = Py.newCode(2, new String[] {"self", "event", "perc_loss", "i", "trials", "perc_win"}, "/media/Almond/jython/monty_multiple.py", "run_switch", false, false, funcTable, 1, null, null, 0, 17);
            c$2_run_stay = Py.newCode(2, new String[] {"self", "event", "perc_loss", "i", "trials", "perc_win"}, "/media/Almond/jython/monty_multiple.py", "run_stay", false, false, funcTable, 2, null, null, 0, 17);
            c$3_switch = Py.newCode(1, new String[] {"self"}, "/media/Almond/jython/monty_multiple.py", "switch", false, false, funcTable, 3, null, null, 0, 17);
            c$4_stay = Py.newCode(1, new String[] {"self"}, "/media/Almond/jython/monty_multiple.py", "stay", false, false, funcTable, 4, null, null, 0, 17);
            c$5_MontyHall_multiple = Py.newCode(0, new String[] {}, "/media/Almond/jython/monty_multiple.py", "MontyHall_multiple", false, false, funcTable, 5, null, null, 0, 16);
            c$6_main = Py.newCode(0, new String[] {}, "/media/Almond/jython/monty_multiple.py", "main", false, false, funcTable, 6, null, null, 0, 16);
        }
        
        
        public PyCode getMain() {
            if (c$6_main == null) _PyInner.initConstants();
            return c$6_main;
        }
        
        public PyObject call_function(int index, PyFrame frame) {
            switch (index){
                case 0:
                return _PyInner.init$1(frame);
                case 1:
                return _PyInner.run_switch$2(frame);
                case 2:
                return _PyInner.run_stay$3(frame);
                case 3:
                return _PyInner.switch$4(frame);
                case 4:
                return _PyInner.stay$5(frame);
                case 5:
                return _PyInner.MontyHall_multiple$6(frame);
                case 6:
                return _PyInner.main$7(frame);
                default:
                return null;
            }
        }
        
        private static PyObject init$1(PyFrame frame) {
            frame.getlocal(0).__setattr__("switch_button", frame.getglobal("awt").__getattr__("Button").__call__(s$0));
            frame.getlocal(0).__setattr__("stay_button", frame.getglobal("awt").__getattr__("Button").__call__(s$1));
            frame.getlocal(0).__setattr__("box", frame.getglobal("awt").__getattr__("TextArea").__call__(i$2, i$3));
            frame.getlocal(0).__setattr__("title", frame.getglobal("awt").__getattr__("Label").__call__(s$4));
            frame.getlocal(0).__setattr__("output", frame.getglobal("awt").__getattr__("TextArea").__call__(i$2, i$5));
            frame.getlocal(0).__setattr__("wins", frame.getglobal("awt").__getattr__("TextArea").__call__(i$2, i$6));
            frame.getlocal(0).__setattr__("win_label", frame.getglobal("awt").__getattr__("Label").__call__(s$7));
            frame.getlocal(0).__setattr__("losses", frame.getglobal("awt").__getattr__("TextArea").__call__(i$2, i$6));
            frame.getlocal(0).__setattr__("loss_label", frame.getglobal("awt").__getattr__("Label").__call__(s$8));
            frame.getlocal(0).__setattr__("percent_win_label", frame.getglobal("awt").__getattr__("Label").__call__(s$9));
            frame.getlocal(0).__setattr__("percent_win", frame.getglobal("awt").__getattr__("TextArea").__call__(i$2, i$6));
            frame.getlocal(0).__setattr__("percent_loss_label", frame.getglobal("awt").__getattr__("Label").__call__(s$10));
            frame.getlocal(0).__setattr__("percent_loss", frame.getglobal("awt").__getattr__("TextArea").__call__(i$2, i$6));
            frame.getlocal(0).__getattr__("switch_button").__setattr__("actionPerformed", frame.getlocal(0).__getattr__("run_switch"));
            frame.getlocal(0).__getattr__("stay_button").__setattr__("actionPerformed", frame.getlocal(0).__getattr__("run_stay"));
            frame.setlocal(1, frame.getglobal("GridBag").__call__(frame.getlocal(0)));
            frame.getlocal(1).__getattr__("add").__call__(new PyObject[] {frame.getlocal(0).__getattr__("title"), i$11, i$11, i$2}, new String[] {"gridx", "gridy", "gridwidth"});
            frame.getlocal(1).__getattr__("add").__call__(new PyObject[] {frame.getlocal(0).__getattr__("box"), i$11, i$12, i$2}, new String[] {"gridx", "gridy", "gridwidth"});
            frame.getlocal(1).__getattr__("add").__call__(new PyObject[] {frame.getlocal(0).__getattr__("switch_button"), i$11, i$2}, new String[] {"gridx", "gridy"});
            frame.getlocal(1).__getattr__("add").__call__(new PyObject[] {frame.getlocal(0).__getattr__("stay_button"), i$12, i$2}, new String[] {"gridx", "gridy"});
            frame.getlocal(1).__getattr__("add").__call__(new PyObject[] {frame.getlocal(0).__getattr__("output"), i$11, i$13, i$2}, new String[] {"gridx", "gridy", "gridwidth"});
            frame.getlocal(1).__getattr__("add").__call__(new PyObject[] {frame.getlocal(0).__getattr__("win_label"), i$11, i$14}, new String[] {"gridx", "gridy"});
            frame.getlocal(1).__getattr__("add").__call__(new PyObject[] {frame.getlocal(0).__getattr__("wins"), i$12, i$14}, new String[] {"gridx", "gridy"});
            frame.getlocal(1).__getattr__("add").__call__(new PyObject[] {frame.getlocal(0).__getattr__("loss_label"), i$11, i$15}, new String[] {"gridx", "gridy"});
            frame.getlocal(1).__getattr__("add").__call__(new PyObject[] {frame.getlocal(0).__getattr__("losses"), i$12, i$15}, new String[] {"gridx", "gridy"});
            frame.getlocal(1).__getattr__("add").__call__(new PyObject[] {frame.getlocal(0).__getattr__("percent_win_label"), i$11, i$16}, new String[] {"gridx", "gridy"});
            frame.getlocal(1).__getattr__("add").__call__(new PyObject[] {frame.getlocal(0).__getattr__("percent_win"), i$12, i$16}, new String[] {"gridx", "gridy"});
            frame.getlocal(1).__getattr__("add").__call__(new PyObject[] {frame.getlocal(0).__getattr__("percent_loss_label"), i$11, i$17}, new String[] {"gridx", "gridy"});
            frame.getlocal(1).__getattr__("add").__call__(new PyObject[] {frame.getlocal(0).__getattr__("percent_loss"), i$12, i$17}, new String[] {"gridx", "gridy"});
            return Py.None;
        }
        
        private static PyObject run_switch$2(PyFrame frame) {
            // Temporary Variables
            PyObject t$0$PyObject, t$1$PyObject;
            
            // Code
            // global wincount
            // global losscount
            frame.getlocal(0).__getattr__("output").invoke("setText", s$18);
            frame.setglobal("wincount", i$11);
            frame.setglobal("losscount", i$11);
            frame.setlocal(4, frame.getglobal("int").__call__(frame.getlocal(0).__getattr__("box").invoke("getText")));
            t$0$PyObject = frame.getglobal("range").__call__(frame.getlocal(4)).__iter__();
            while ((t$1$PyObject = t$0$PyObject.__iternext__()) != null) {
                frame.setlocal(3, t$1$PyObject);
                frame.getlocal(0).invoke("switch");
            }
            frame.getlocal(0).__getattr__("wins").invoke("setText", frame.getglobal("str").__call__(frame.getglobal("wincount")));
            frame.getlocal(0).__getattr__("losses").invoke("setText", frame.getglobal("str").__call__(frame.getglobal("losscount")));
            frame.setlocal(5, i$19._mul(frame.getglobal("float").__call__(frame.getglobal("wincount")))._div(frame.getlocal(4)));
            frame.getlocal(0).__getattr__("percent_win").invoke("setText", frame.getglobal("str").__call__(frame.getlocal(5))._add(s$20));
            frame.setlocal(2, i$19._mul(frame.getglobal("float").__call__(frame.getglobal("losscount")))._div(frame.getlocal(4)));
            frame.getlocal(0).__getattr__("percent_loss").invoke("setText", frame.getglobal("str").__call__(frame.getlocal(2))._add(s$20));
            return Py.None;
        }
        
        private static PyObject run_stay$3(PyFrame frame) {
            // Temporary Variables
            PyObject t$0$PyObject, t$1$PyObject;
            
            // Code
            // global wincount
            // global losscount
            frame.getlocal(0).__getattr__("output").invoke("setText", s$18);
            frame.setglobal("wincount", i$11);
            frame.setglobal("losscount", i$11);
            frame.setlocal(4, frame.getglobal("int").__call__(frame.getlocal(0).__getattr__("box").invoke("getText")));
            t$0$PyObject = frame.getglobal("range").__call__(frame.getlocal(4)).__iter__();
            while ((t$1$PyObject = t$0$PyObject.__iternext__()) != null) {
                frame.setlocal(3, t$1$PyObject);
                frame.getlocal(0).invoke("stay");
            }
            frame.getlocal(0).__getattr__("wins").invoke("setText", frame.getglobal("str").__call__(frame.getglobal("wincount")));
            frame.getlocal(0).__getattr__("losses").invoke("setText", frame.getglobal("str").__call__(frame.getglobal("losscount")));
            frame.setlocal(5, i$19._mul(frame.getglobal("float").__call__(frame.getglobal("wincount")))._div(frame.getlocal(4)));
            frame.getlocal(0).__getattr__("percent_win").invoke("setText", frame.getglobal("str").__call__(frame.getlocal(5))._add(s$20));
            frame.setlocal(2, i$19._mul(frame.getglobal("float").__call__(frame.getglobal("losscount")))._div(frame.getlocal(4)));
            frame.getlocal(0).__getattr__("percent_loss").invoke("setText", frame.getglobal("str").__call__(frame.getlocal(2))._add(s$20));
            return Py.None;
        }
        
        private static PyObject switch$4(PyFrame frame) {
            // global wincount
            // global losscount
            frame.getlocal(0).__setattr__("car", frame.getglobal("Random").__call__());
            frame.getlocal(0).__setattr__("car", frame.getlocal(0).__getattr__("car").invoke("nextInt", i$13));
            frame.getlocal(0).__setattr__("pick", frame.getglobal("Random").__call__());
            frame.getlocal(0).__setattr__("pick", frame.getlocal(0).__getattr__("pick").invoke("nextInt", i$13));
            if (frame.getlocal(0).__getattr__("pick")._eq(i$11).__nonzero__()) {
                if (frame.getlocal(0).__getattr__("car")._eq(i$11).__nonzero__()) {
                    frame.getlocal(0).__getattr__("output").invoke("append", s$21);
                    frame.setglobal("losscount", frame.getglobal("losscount").__iadd__(i$12));
                }
                if (frame.getlocal(0).__getattr__("car")._eq(i$12).__nonzero__()) {
                    frame.getlocal(0).__getattr__("output").invoke("append", s$22);
                    frame.setglobal("wincount", frame.getglobal("wincount").__iadd__(i$12));
                }
                if (frame.getlocal(0).__getattr__("car")._eq(i$2).__nonzero__()) {
                    frame.getlocal(0).__getattr__("output").invoke("append", s$22);
                    frame.setglobal("wincount", frame.getglobal("wincount").__iadd__(i$12));
                }
            }
            if (frame.getlocal(0).__getattr__("pick")._eq(i$12).__nonzero__()) {
                if (frame.getlocal(0).__getattr__("car")._eq(i$11).__nonzero__()) {
                    frame.getlocal(0).__getattr__("output").invoke("append", s$22);
                    frame.setglobal("wincount", frame.getglobal("wincount").__iadd__(i$12));
                }
                if (frame.getlocal(0).__getattr__("car")._eq(i$12).__nonzero__()) {
                    frame.getlocal(0).__getattr__("output").invoke("append", s$21);
                    frame.setglobal("losscount", frame.getglobal("losscount").__iadd__(i$12));
                }
                if (frame.getlocal(0).__getattr__("car")._eq(i$2).__nonzero__()) {
                    frame.getlocal(0).__getattr__("output").invoke("append", s$22);
                    frame.setglobal("wincount", frame.getglobal("wincount").__iadd__(i$12));
                }
            }
            if (frame.getlocal(0).__getattr__("pick")._eq(i$2).__nonzero__()) {
                if (frame.getlocal(0).__getattr__("car")._eq(i$11).__nonzero__()) {
                    frame.getlocal(0).__getattr__("output").invoke("append", s$22);
                    frame.setglobal("wincount", frame.getglobal("wincount").__iadd__(i$12));
                }
                if (frame.getlocal(0).__getattr__("car")._eq(i$12).__nonzero__()) {
                    frame.getlocal(0).__getattr__("output").invoke("append", s$22);
                    frame.setglobal("wincount", frame.getglobal("wincount").__iadd__(i$12));
                }
                if (frame.getlocal(0).__getattr__("car")._eq(i$2).__nonzero__()) {
                    frame.getlocal(0).__getattr__("output").invoke("append", s$21);
                    frame.setglobal("losscount", frame.getglobal("losscount").__iadd__(i$12));
                }
            }
            return Py.None;
        }
        
        private static PyObject stay$5(PyFrame frame) {
            // global wincount
            // global losscount
            frame.getlocal(0).__setattr__("car", frame.getglobal("Random").__call__());
            frame.getlocal(0).__setattr__("car", frame.getlocal(0).__getattr__("car").invoke("nextInt", i$13));
            frame.getlocal(0).__setattr__("pick", frame.getglobal("Random").__call__());
            frame.getlocal(0).__setattr__("pick", frame.getlocal(0).__getattr__("pick").invoke("nextInt", i$13));
            if (frame.getlocal(0).__getattr__("pick")._eq(i$11).__nonzero__()) {
                if (frame.getlocal(0).__getattr__("car")._eq(i$11).__nonzero__()) {
                    frame.getlocal(0).__getattr__("output").invoke("append", s$22);
                    frame.setglobal("wincount", frame.getglobal("wincount").__iadd__(i$12));
                }
                if (frame.getlocal(0).__getattr__("car")._eq(i$12).__nonzero__()) {
                    frame.getlocal(0).__getattr__("output").invoke("append", s$21);
                    frame.setglobal("losscount", frame.getglobal("losscount").__iadd__(i$12));
                }
                if (frame.getlocal(0).__getattr__("car")._eq(i$2).__nonzero__()) {
                    frame.getlocal(0).__getattr__("output").invoke("append", s$21);
                    frame.setglobal("losscount", frame.getglobal("losscount").__iadd__(i$12));
                }
            }
            if (frame.getlocal(0).__getattr__("pick")._eq(i$12).__nonzero__()) {
                if (frame.getlocal(0).__getattr__("car")._eq(i$11).__nonzero__()) {
                    frame.getlocal(0).__getattr__("output").invoke("append", s$21);
                    frame.setglobal("losscount", frame.getglobal("losscount").__iadd__(i$12));
                }
                if (frame.getlocal(0).__getattr__("car")._eq(i$12).__nonzero__()) {
                    frame.getlocal(0).__getattr__("output").invoke("append", s$22);
                    frame.setglobal("wincount", frame.getglobal("wincount").__iadd__(i$12));
                }
                if (frame.getlocal(0).__getattr__("car")._eq(i$2).__nonzero__()) {
                    frame.getlocal(0).__getattr__("output").invoke("append", s$21);
                    frame.setglobal("losscount", frame.getglobal("losscount").__iadd__(i$12));
                }
            }
            if (frame.getlocal(0).__getattr__("pick")._eq(i$2).__nonzero__()) {
                if (frame.getlocal(0).__getattr__("car")._eq(i$11).__nonzero__()) {
                    frame.getlocal(0).__getattr__("output").invoke("append", s$21);
                    frame.setglobal("losscount", frame.getglobal("losscount").__iadd__(i$12));
                }
                if (frame.getlocal(0).__getattr__("car")._eq(i$12).__nonzero__()) {
                    frame.getlocal(0).__getattr__("output").invoke("append", s$21);
                    frame.setglobal("losscount", frame.getglobal("losscount").__iadd__(i$12));
                }
                if (frame.getlocal(0).__getattr__("car")._eq(i$2).__nonzero__()) {
                    frame.getlocal(0).__getattr__("output").invoke("append", s$22);
                    frame.setglobal("wincount", frame.getglobal("wincount").__iadd__(i$12));
                }
            }
            return Py.None;
        }
        
        private static PyObject MontyHall_multiple$6(PyFrame frame) {
            frame.setlocal("init", new PyFunction(frame.f_globals, new PyObject[] {}, c$0_init));
            frame.setlocal("run_switch", new PyFunction(frame.f_globals, new PyObject[] {}, c$1_run_switch));
            frame.setlocal("run_stay", new PyFunction(frame.f_globals, new PyObject[] {}, c$2_run_stay));
            frame.setlocal("switch", new PyFunction(frame.f_globals, new PyObject[] {}, c$3_switch));
            frame.setlocal("stay", new PyFunction(frame.f_globals, new PyObject[] {}, c$4_stay));
            return frame.getf_locals();
        }
        
        private static PyObject main$7(PyFrame frame) {
            frame.setglobal("__file__", s$23);
            
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
            frame.setlocal("MontyHall_multiple", Py.makeClass("MontyHall_multiple", new PyObject[] {frame.getname("applet").__getattr__("Applet")}, c$5_MontyHall_multiple, null, MontyHall_multiple.class));
            return Py.None;
        }
        
    }
    public static class MontyHall_multiple extends java.applet.Applet implements org.python.core.PyProxy, org.python.core.ClassDictInit {
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
        
        public MontyHall_multiple() throws java.awt.HeadlessException {
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
            Py.initProxy(this, "monty_multiple", "MontyHall_multiple", args, monty_multiple.jpy$packages, monty_multiple.jpy$proxyProperties, "", new String[] {"pawt.__init__", "monty_multiple"});
        }
        
        static public void classDictInit(PyObject dict) {
            dict.__setitem__("__supernames__", Py.java2py(new String[] {"processInputMethodEvent", "finalize", "requestFocus", "firePropertyChange", "processMouseWheelEvent", "processEvent", "processComponentEvent", "paramString", "coalesceEvents", "requestFocusInWindow", "super__disableEvents", "super__enableEvents", "processMouseEvent", "processKeyEvent", "addImpl", "validateTree", "super__init", "processHierarchyBoundsEvent", "processMouseMotionEvent", "clone", "processContainerEvent", "processFocusEvent", "processHierarchyEvent"}));
        }
        
    }
    public static void moduleDictInit(PyObject dict) {
        dict.__setitem__("__name__", new PyString("monty_multiple"));
        Py.runCode(new _PyInner().getMain(), dict, dict);
    }
    
    public static void main(String[] args) throws java.lang.Exception {
        String[] newargs = new String[args.length+1];
        newargs[0] = "monty_multiple";
        java.lang.System.arraycopy(args, 0, newargs, 1, args.length);
        Py.runMain(monty_multiple._PyInner.class, newargs, monty_multiple.jpy$packages, monty_multiple.jpy$mainProperties, "", new String[] {"pawt.__init__", "monty_multiple"});
    }
    
}
