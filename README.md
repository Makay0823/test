如何使用git工具向github提交代码

大致分为以下几个步骤

安装git环境,工具使用msysgit

1.首先在github上点击头像旁边的加号add new,选择new Repository,自己创建一个名字,假设取名为test
线上的github结束了.

2.开始设置本地的 mysysgit与线上关联,首先是本地pub文件与线上的ssh key关联

3.生成key
$ ssh-keygen -t rsa -C "386408003@qq.com"	//注意这里的-C中的C是大写
之后可以输入一个生成的文件位置，精确到文件名。
设置之后,进入命令提示的目录,默认为 c:\Users\用户名\.ssh 这里只需要.pub的文件另外一个是私钥,自己用,id_rsa.pub这个文件是公钥,用记事本打开,注意下编码格式,如果是乱码说明你的打开工具有问题,打开之后ctrl+A  ctrl+C复制全部内容

4.现状进入线上的github,点击设置找到SSH keys,点击add ssh key,title自己随便写,把刚才复制的内容粘贴到key的文本框里面,保存!大功告成!　

5.现状打开mysysgit这个工具,需要首先全局配置下你的邮箱和名字,命令如下
$ git config --global user.email "386408003@qq.com"
$ git config --global user.name "朱峰"

6.开始和远程也就是github上的库test,进行关联,首先在自己本地的一个文件夹,这里咱们在/GitWorkSpace下进行操作
$ cd /GitWorkSpace

7.首先需要克隆线上的库
//后面就是刚才你创建项目的git地址,如果找不到,就去线上点击刚才你创建的test这个项目里面去复制
$ git clone https://github.com/386408003/test.git

8.开始修改,开始提交

//首先先链接下远程的git库
$ git remote 	//查看所有的分支
$ git remote add origin https://github.com/386408003/test.git
$ git remote rm origin 

//查看现在所有修改过了文件状态
$ git status

//开始把本地的文件全部添加下
$ git add .

//提交
$ git commit -m "这里是我写的提交注释"

//提交到远程
$ git push -u origin master




WARNING: LF will be replaced by CRLF	解决办法
删除刚刚提交出现的.git文件夹
$ rm -rf .git  
$ git config --global core.autocrlf false  
这样系统就不会去进行换行符的转换了
$ git init  	//初始化配置丢失(好像是)
$ git add .