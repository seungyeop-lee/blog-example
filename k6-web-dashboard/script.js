import http from "k6/http";

export let options = {
    vus: 5,          // 5개의 가상 사용자를 생성한다.
    duration: "10s", // 10초 동안 부하를 발생 시킨다.
}

export default function () {
    http.get("http://host.docker.internal:5678"); // 테스트 대상 서버로 GET 요청을 보낸다.
}
