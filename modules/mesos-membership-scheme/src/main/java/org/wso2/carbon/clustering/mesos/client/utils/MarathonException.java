/*
* Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package org.wso2.carbon.clustering.mesos.client.utils;

public class MarathonException extends Exception {
    private static final long serialVersionUID = 1L;
    private int status;
    private String message;

    public MarathonException(int status, String message) {
        this.status = status;
        this.message = message;
    }

    /**
     * Gets the HTTP status code of the failure, such as 404.
     */
    public int getStatus() {
        return status;
    }

    @Override
    public String getMessage() {
        return message + " (http status: " + status + ")";
    }

    @Override
    public String toString() {
        return message + " (http status: " + status + ")";
    }
}