package com.github.misabiko.trunkintellijplugin.services

import com.intellij.openapi.project.Project
import com.github.misabiko.trunkintellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
