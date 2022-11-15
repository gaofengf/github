new Vue({
    el:"#login",
    data:{
       user:{cardid:'',password:''},
        cardid:'',
    },
    methods:{
       getLogin:function () {
        _this=this;
        axios.post("../user/getLogin",_this.user).then(function (response) {
            if(response.data.flag){
                location.href="../main/toList";
            }else{
                alert(response.data.msg)
            }
        })
       }
    },
});
