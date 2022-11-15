var vm = new Vue({
    el:'#test_list',
    data:{
        list:[],
        entity:{},
        total:0,
        pageNum:0,
        pageSize:3,
        pages:1
    },
    created(){
        this.getTestList();
    },
    methods:{
        getTestList:function () {
            var _this = this;
            var url = '../../teacher/getTestList.do?pageNum='+_this.pageNum+"&pageSize="+_this.pageSize;
            axios.post(url,_this.entity).then(function (response) {
                _this.list = response.data.list;
                _this.total = response.data.total;
                _this.pageNum = response.data.pageNum;
                _this.pageSize  =response.data.pageSize;
                _this.pages = response.data.pages;

            });
        },
        paging:function (pageNum) {
            if(pageNum>=this.pages-1){
                this.pageNum = this.pages-1
            }else{
                this.pageNum = pageNum;
            }
            this.getTestList();
        }
    }
});
