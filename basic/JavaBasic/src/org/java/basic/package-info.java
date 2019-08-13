

@TemplateRegistration(
        folder = "Other",
        iconBase="org/java/basic/Java.gif", 
        displayName = "#HTMLtemplate_displayName", 
        content = "Main_1.java",
        description = "Description.html",
        scriptEngine="freemarker")
@Messages(value = "HTMLtemplate_displayName=Empty HTML file")
package org.java.basic;

import org.netbeans.api.templates.TemplateRegistration;
import org.openide.util.NbBundle.Messages;