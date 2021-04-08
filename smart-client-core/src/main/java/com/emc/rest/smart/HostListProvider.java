/*
 * Copyright (c) 2015-2021 Dell Inc., or its subsidiaries. All Rights Reserved.
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
package com.emc.rest.smart;

import java.util.List;

public interface HostListProvider {
    List<Host> getHostList();

    /**
     * If this completes without throwing an exception, the host is considered healthy
     * (<code>host.setHealthy(true)</code> is called). Otherwise, the host is considered unhealthy/down
     * (<code>host.setHealthy(false)</code> is called).
     */
    void runHealthCheck(Host host);

    /**
     * Destroy this provider. Any system resources associated with the provider
     * will be cleaned up.
     * <p>
     * The provider must not be reused after this method is called otherwise
     * undefined behavior will occur.
     */
    void destroy();
}
