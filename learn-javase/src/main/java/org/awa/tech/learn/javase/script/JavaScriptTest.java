package org.awa.tech.learn.javase.script;

import javax.script.*;

/**
 * DESCRIPTION
 * Created by wb-lyw190343 on 2017/7/20.
 */
public class JavaScriptTest {

    public static void main(String[] args) throws ScriptException {
//        greet();
//        useCustomBingding();

//        functionInvoke();
//        methodInvoke();
        interfaceInvoke();
    }

    public static void interfaceInvoke(){

        try {
            ScriptEngine engine = getScriptEngine();
            String scriptText = "var obj = {greet : function (name) {print('Hello,'+name)}}";

            engine.eval(scriptText);

            Invocable invocable = (Invocable) engine;

            Greet greet = invocable.getInterface(engine.get("obj"),Greet.class);
            greet.greet("lisa");
        } catch (ScriptException e) {
            e.printStackTrace();
        }

    }


    /**
     * 调用js顶层方法
     */
    public static void methodInvoke(){

        try {
            ScriptEngine engine = getScriptEngine();
            String scriptText = "var obj = {greet : function (name) {print('Hello,'+name)}}";

            engine.eval(scriptText);

            Invocable invocable = (Invocable) engine;

            invocable.invokeMethod(engine.get("obj"),"greet","list");
        } catch (ScriptException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }


    }

    /**
     * 调用js顶层方法
     */
    public static void functionInvoke(){

        try {
            ScriptEngine engine = getScriptEngine();
            String scriptText = "function greet(name) {print('Hello,'+name)}";

            engine.eval(scriptText);

            Invocable invocable = (Invocable) engine;
            invocable.invokeFunction("greet","list");
        } catch (ScriptException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }


    }

    public static void greet(){
        ScriptEngineManager engineManager = new ScriptEngineManager();
        ScriptEngine engine = engineManager.getEngineByName("JavaScript");
        if(engine != null){
            try {
                Object result = engine.eval("var a = 4; a*a;");
                System.out.println(result);
            } catch (ScriptException e) {
                e.printStackTrace();
            }
        }
    }

    public static void useCustomBingding() throws ScriptException{
        ScriptEngineManager engineManager = new ScriptEngineManager();
        ScriptEngine engine = engineManager.getEngineByName("JavaScript");
        if(engine != null){
            Bindings bindings = new SimpleBindings();
            bindings.put("num",8);
            Object result = engine.eval("num * num;",bindings);
            System.out.println(result);
        }
    }

    public static ScriptEngine getScriptEngine(){
        ScriptEngineManager engineManager = new ScriptEngineManager();
        ScriptEngine engine = engineManager.getEngineByName("JavaScript");
        return engine;
    }

}
