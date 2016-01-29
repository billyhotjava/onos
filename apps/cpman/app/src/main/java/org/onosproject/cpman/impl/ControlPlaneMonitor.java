/*
 * Copyright 2015-2016 Open Networking Laboratory
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
package org.onosproject.cpman.impl;

import org.apache.felix.scr.annotations.Activate;
import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Deactivate;
import org.apache.felix.scr.annotations.Service;
import org.onosproject.cluster.NodeId;
import org.onosproject.cpman.ControlLoad;
import org.onosproject.cpman.ControlMetric;
import org.onosproject.cpman.ControlMetricType;
import org.onosproject.cpman.ControlPlaneMonitorService;
import org.onosproject.net.DeviceId;
import org.slf4j.Logger;

import java.util.Optional;
import java.util.concurrent.TimeUnit;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * Control plane monitoring service class.
 */
@Component(immediate = true)
@Service
public class ControlPlaneMonitor implements ControlPlaneMonitorService {

    private final Logger log = getLogger(getClass());

    @Activate
    public void activate() {
    }

    @Deactivate
    public void deactivate() {
    }

    @Override
    public void updateMetric(ControlMetric cpm, Integer updateInterval,
                             Optional<DeviceId> deviceId) {

    }

    @Override
    public void updateMetric(ControlMetric controlMetric, Integer updateInterval,
                             String resourceName) {

    }

    @Override
    public ControlLoad getLoad(NodeId nodeId, ControlMetricType type,
                               Optional<DeviceId> deviceId) {
        return null;
    }

    @Override
    public ControlLoad getLoad(NodeId nodeId, ControlMetricType type,
                               Optional<DeviceId> deviceId, int duration, TimeUnit unit) {
        return null;
    }
}