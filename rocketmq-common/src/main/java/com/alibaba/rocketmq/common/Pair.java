/**
 * Copyright (C) 2010-2013 Alibaba Group Holding Limited
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alibaba.rocketmq.common;

/**
 * @author shijia.wxr<vintage.wang@gmail.com>
 * 
 */
public class Pair<T1, T2> {
    private T1 object1;
    private T2 object2;


    public Pair(T1 object1, T2 object2) {
        this.object1 = object1;
        this.object2 = object2;
    }


    public T1 getObject1() {
        return object1;
    }


    public void setObject1(T1 object1) {
        this.object1 = object1;
    }


    public T2 getObject2() {
        return object2;
    }


    public void setObject2(T2 object2) {
        this.object2 = object2;
    }
}
