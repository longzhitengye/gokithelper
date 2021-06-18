package com.github.longzhitengye.gokithelper.services

import com.github.longzhitengye.gokithelper.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
