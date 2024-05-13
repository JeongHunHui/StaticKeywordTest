import http from "k6/http";
import { group, check, sleep } from "k6";

const BASE_URL = "http://localhost:8080";
const SLEEP_DURATION = 0.1;

const FRUIT_ENUM = "/fruitEnum";
const NON_STATIC_FRUIT_CLASS = "/nonStaticFruitClass";
const FRUIT_CLASS = "/fruitClass";

export let options = {
    vus: 2500, // 동시 사용자 수
    duration: "10s", // 테스트 지속 시간
};

function runGroup(url) {
    let request = http.get(url);

    check(request, {
        "OK": (r) => r.status === 200
    });
}

const groups = {
    [FRUIT_ENUM]: () => runGroup(BASE_URL + FRUIT_ENUM),
    [NON_STATIC_FRUIT_CLASS]: () => runGroup(BASE_URL + NON_STATIC_FRUIT_CLASS),
    [FRUIT_CLASS]: () => runGroup(BASE_URL + FRUIT_CLASS),
};

export default function() {
    const runGroup = groups[__ENV.RUN_GROUP];
    if (runGroup) {
        group(__ENV.RUN_GROUP, runGroup);
    }
}