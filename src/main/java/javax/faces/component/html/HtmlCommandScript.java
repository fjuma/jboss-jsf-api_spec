/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 * 
 * Copyright (c) 1997-2010 Oracle and/or its affiliates. All rights reserved.
 * 
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common Development
 * and Distribution License("CDDL") (collectively, the "License").  You
 * may not use this file except in compliance with the License.  You can
 * obtain a copy of the License at
 * https://glassfish.java.net/public/CDDL+GPL_1_1.html
 * or packager/legal/LICENSE.txt.  See the License for the specific
 * language governing permissions and limitations under the License.
 * 
 * When distributing the software, include this License Header Notice in each
 * file and include the License file at packager/legal/LICENSE.txt.
 * 
 * GPL Classpath Exception:
 * Oracle designates this particular file as subject to the "Classpath"
 * exception as provided by Oracle in the GPL Version 2 section of the License
 * file that accompanied this code.
 * 
 * Modifications:
 * If applicable, add the following below the License Header, with the fields
 * enclosed by brackets [] replaced by your own identifying information:
 * "Portions Copyright [year] [name of copyright owner]"
 * 
 * Contributor(s):
 * If you wish your version of this file to be governed by only the CDDL or
 * only the GPL Version 2, indicate your decision by adding "[Contributor]
 * elects to include this software in this distribution under the [CDDL or GPL
 * Version 2] license."  If you don't indicate a single choice of license, a
 * recipient has the option to distribute your version of this file under
 * either the CDDL, the GPL Version 2 or to extend the choice of license to
 * its licensees as provided above.  However, if you add GPL Version 2 code
 * and therefore, elected the GPL Version 2 license, then the option applies
 * only if the new code is made subject to such option by the copyright
 * holder.
 */
package javax.faces.component.html;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.faces.context.FacesContext;
import javax.el.MethodExpression;
import javax.el.ValueExpression;


/*
 * ******* GENERATED CODE - DO NOT EDIT *******
 */


/**
 * <p>Represents an HTML <code>script</code> element for a function that acts
 * like an ajax form submit.  This component must be placed inside
 * a form, and requires JavaScript to be enabled in the client.</p>
 * <p>By default, the <code>rendererType</code> property must be set to "<code>javax.faces.Script</code>".
 * This value can be changed by calling the <code>setRendererType()</code> method.</p>
 */
public class HtmlCommandScript extends javax.faces.component.UICommand {



    private static final String OPTIMIZED_PACKAGE = "javax.faces.component.";

    public HtmlCommandScript() {
        super();
        setRendererType("javax.faces.Script");
    }


    /**
     * <p>The standard component type for this component.</p>
     */
    public static final String COMPONENT_TYPE = "javax.faces.HtmlCommandScript";


    protected enum PropertyKeys {
        autorun,
        execute,
        name,
        onerror,
        onevent,
        render,
        resetValues,
;
        String toString;
        PropertyKeys(String toString) { this.toString = toString; }
        PropertyKeys() { }
        public String toString() {
            return ((toString != null) ? toString : super.toString());
        }
}

    /**
     * <p>Return the value of the <code>autorun</code> property.</p>
     * @return the property value
     * <p>Contents: Whether to execute declared JavaScript function during <code>load</code> event of the <code>window</code>.
     * Defaults to <code>false</code>.
     */
    public boolean isAutorun() {
        return (java.lang.Boolean) getStateHelper().eval(PropertyKeys.autorun, false);

    }

    /**
     * <p>Set the value of the <code>autorun</code> property.</p>
     * @param autorun the new property value
     */
    public void setAutorun(boolean autorun) {
        getStateHelper().put(PropertyKeys.autorun, autorun);
    }


    /**
     * <p>Return the value of the <code>execute</code> property.</p>
     * @return the property value
     * <p>Contents: This is a space separated list of client identifiers of components
     * that will participate in the "execute" portion of the Request Processing Lifecycle.
     * If a literal is specified the identifiers must be space delimited.
     * Any of the keywords "@this", "@form", "@all", "@none" may be specified in the identifier list.
     * If not specified, the default value of "@this" is assumed.
     * For example, <code>@this clientIdOne clientIdTwo</code>.
     */
    public java.lang.String getExecute() {
        return (java.lang.String) getStateHelper().eval(PropertyKeys.execute);

    }

    /**
     * <p>Set the value of the <code>execute</code> property.</p>
     * @param execute the new property value
     */
    public void setExecute(java.lang.String execute) {
        getStateHelper().put(PropertyKeys.execute, execute);
    }


    /**
     * <p>Return the value of the <code>name</code> property.</p>
     * @return the property value
     * <p>Contents: Name of JavaScript function to be declared, e.g. <code>name="functionName"</code>.
     * This can be a namespaced function name, e.g. <code>name="ez.functionName"</code>.
     */
    public java.lang.String getName() {
        return (java.lang.String) getStateHelper().eval(PropertyKeys.name);

    }

    /**
     * <p>Set the value of the <code>name</code> property.</p>
     * @param name the new property value
     */
    public void setName(java.lang.String name) {
        getStateHelper().put(PropertyKeys.name, name);
    }


    /**
     * <p>Return the value of the <code>onerror</code> property.</p>
     * @return the property value
     * <p>Contents: The name of the JavaScript function that will handle errors.
     */
    public java.lang.String getOnerror() {
        return (java.lang.String) getStateHelper().eval(PropertyKeys.onerror);

    }

    /**
     * <p>Set the value of the <code>onerror</code> property.</p>
     * @param onerror the new property value
     */
    public void setOnerror(java.lang.String onerror) {
        getStateHelper().put(PropertyKeys.onerror, onerror);
    }


    /**
     * <p>Return the value of the <code>onevent</code> property.</p>
     * @return the property value
     * <p>Contents: The name of the JavaScript function that will handle UI events.
     */
    public java.lang.String getOnevent() {
        return (java.lang.String) getStateHelper().eval(PropertyKeys.onevent);

    }

    /**
     * <p>Set the value of the <code>onevent</code> property.</p>
     * @param onevent the new property value
     */
    public void setOnevent(java.lang.String onevent) {
        getStateHelper().put(PropertyKeys.onevent, onevent);
    }


    /**
     * <p>Return the value of the <code>render</code> property.</p>
     * @return the property value
     * <p>Contents: This is a space separated list of client identifiers of components
     * that will participate in the "render" portion of the Request Processing Lifecycle.
     * If a literal is specified the identifiers must be space delimited.
     * Any of the keywords "@this", "@form", "@all", "@none" may be specified in the identifier list.
     * If not specified, the default value of "@none" is assumed.
     * For example, <code>@this clientIdOne clientIdTwo</code>.
     */
    public java.lang.String getRender() {
        return (java.lang.String) getStateHelper().eval(PropertyKeys.render);

    }

    /**
     * <p>Set the value of the <code>render</code> property.</p>
     * @param render the new property value
     */
    public void setRender(java.lang.String render) {
        getStateHelper().put(PropertyKeys.render, render);
    }


    /**
     * <p>Return the value of the <code>resetValues</code> property.</p>
     * @return the property value
     * <p>Contents: Reset specific input values.
     * Interpret the value of the <code>render</code> attribute as a space separated list of client identifiers
     * suitable for passing directly to <code>UIViewRoot.resetValues()</code>.
     * The implementation must cause an <code>ActionListener</code> to be attached to the <code>ActionSource</code>
     * component in which this tag is nested that calls <code>UIViewRoot.resetValues()</code> passing the value
     * of the <code>render</code> attribute as the argument.
     */
    public java.lang.Boolean getResetValues() {
        return (java.lang.Boolean) getStateHelper().eval(PropertyKeys.resetValues);

    }

    /**
     * <p>Set the value of the <code>resetValues</code> property.</p>
     * @param resetValues the new property value
     */
    public void setResetValues(java.lang.Boolean resetValues) {
        getStateHelper().put(PropertyKeys.resetValues, resetValues);
    }


    private void handleAttribute(String name, Object value) {
        List<String> setAttributes = (List<String>) this.getAttributes().get("javax.faces.component.UIComponentBase.attributesThatAreSet");
        if (setAttributes == null) {
            String cname = this.getClass().getName();
            if (cname != null && cname.startsWith(OPTIMIZED_PACKAGE)) {
                setAttributes = new ArrayList<String>(6);
                this.getAttributes().put("javax.faces.component.UIComponentBase.attributesThatAreSet", setAttributes);
            }
        }
        if (setAttributes != null) {
            if (value == null) {
                ValueExpression ve = getValueExpression(name);
                if (ve == null) {
                    setAttributes.remove(name);
                }
            } else if (!setAttributes.contains(name)) {
                setAttributes.add(name);
            }
        }
    }

}
