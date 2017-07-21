package org.awa.tech.learn.javase.script;

import javax.script.*;

/**
 * DESCRIPTION
 * Created by wb-lyw190343 on 2017/7/20.
 */
public class JavaScriptTest {

    public static void main(String[] args) throws ScriptException {
//        greet();
        useCustomBingding();

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

}
