new Vue({
    el:'#userlist',
    data:{
        list:[]
    },
    methods:{
        findAll:function () {
        _this=this;
        axios.get("../user/findAll").then(function (response) {
           _this.list=response.data;
        })
        },
        tode:function () {
            location.href="../main/tode";
        }
    },
    created:function () {
        this.findAll();
    }
})