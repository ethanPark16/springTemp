require.config({
    baseUrl: '/resources/js', // 'js' 라는 폴더를 기본 폴더로 설정한다. 

    paths:{

        //뒤에 js 확장자는 생략한다.
        'aspect': '/resources/js/modules/aspect'
    },

    shim:{
        'aspect':{
            exports:'aspect' //로드된 aspect 라이브러리는 aspect 라는 이름의 객체로 사용할 수 있게 해준다
        }
    }
});

require( ['aspect'],

    //디펜던시 로드뒤 콜백함수. 로드된 디펜던시들은 콜백함수의 인자로 넣어줄 수 있다.
    function (aspect) {

        //페이지가 완전히 로드된 뒤에 실행
        $(document).ready(function () {
        	aspect.before('test*');
        });
    }
);