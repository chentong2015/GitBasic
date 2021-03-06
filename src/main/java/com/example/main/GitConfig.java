package com.example.main;

// 注意fork的区别：
//  Any public Git repository can be forked or cloned.
//  A fork creates a completely independent copy of Git repository.
//  Git clone creates a linked copy that will continue to synchronize with the target repository.
public class GitConfig {

    // System level Config
    // 1. git config --system
    // 2. in /etc/gitconfig or c:\Program Files (x86)\Git\gitconfig

    // User level Config: 重写上一层的配置 !!
    // 1. git config --global
    // 2. ~/.gitconfig or c:\User\<Name>\.gitconfig
    //
    // > git config -global user.name
    // > git config -global user.email
    // > git config -global color.ui auto  使得输出的显示带颜色
    // > git config -global core.editor vim
    // > git config -global help.autocorrect 1 等待1s之后执行，会自动识别和纠正错误的指令拼写
    // > git config -global --list  显示所有的用户系统设置
    // > cat ~/.gitconfig           配置出来的文件

    // > git config -global alias.lga "log --graph --oneline --all --decorate"
    // > git lga 自定义简单的别名来执行具有复杂的指令

    // Repository Level Configuration: 重写上一层的配置 !!
    // 1. git config
    // 2. .git/config in each repo
    //
    // > git config user.name "chen tong"
    // > git config --unset user.name 取消指定的设置
    // > git config --list
    // > vim .git/config

    // .gitignore 不需要提交的文件和配置
}
