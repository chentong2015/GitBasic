package com.example.main;

public class GitRemotely {

    // > git clone ....git 克隆项目的所有版本信息，历史记录
    //     如果使用HTTP协议，需要提供用户名称和密码

    // > git log
    // > git log --oneline
    // > git log --oneline | wc -l 统计行数，也即项目提交的次数
    // > git log --oneline --graph 图形化显示日志|
    // > git shortlog  显示日志中所有提交的用户和提交的信息
    // > git shortlog -sne Summary, Number of commit, Email 按照统计提交的次数来显示

    // > git show HEAD 显示上一次提交的完整信息
    // > git remote 显示远端的名称
    // > git remote -v 显示链接的远端仓库
    // > git remote rm origin 移除远端的仓库
    // > git remote add ...   添加远端的仓库

    // > git remote add origin https://github.com/xxx.git  指定添加的远程仓库的名称
    // > git remote add feature https://github.com/xxx.git 添加多个远程仓库，push时指定名称

    // > git branch 显示本地的分支
    // > git branch -r 显示远端的分支

    // > git fetch
    // > git merge
    // > git pull
    // > git pull --set-upstream master origin/master 定义分支的追踪
    //   Branch master set up to track remote branch master from origin
    // > git pull origin master 注明要pull的分支
    //     如果这里使用SSH协议，则不要使用SSH key来完成认证，而不是HTTP的密码

    // Work with tags
    // > git tag 显示所有标记的标签
    // > git tag v1.0
    // > git tag -a v1.0_with_message 给声明的tag提供信息
    // > git tag -S v1.0_signed
    //   Enter passphrase: *** 提供密码来签名
    // > git tag -v v1.0_with_message verify指定的tag标签
    // > git push --tags 默认push是不会push tags的信息 ==> 提交tags信息到远端
}
