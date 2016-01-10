/*
 * This file is part of BouncyBallPlus.
 *
 * BouncyBallPlus is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * BouncyBallPlus is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with BouncyBallPlus.  If not, see <http://www.gnu.org/licenses/>.
 */
package io.github.jython234.bouncyballplus;

import org.blockserver.core.Server;
import org.blockserver.core.modules.network.NetworkModule;
import org.blockserver.core.modules.scheduler.SchedulerModule;

/**
 * Created by atzei on 1/10/2016.
 */
public class BouncyNetworkModule extends NetworkModule{
    public BouncyNetworkModule(Server server, SchedulerModule schedulerModule) {
        super(server, schedulerModule);
    }


}
