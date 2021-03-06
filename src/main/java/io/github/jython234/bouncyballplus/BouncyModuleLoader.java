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
import org.blockserver.core.module.Module;
import org.blockserver.core.module.ModuleLoader;
import org.blockserver.core.modules.logging.LoggingModule;
import org.blockserver.core.modules.message.MessageModule;
import org.blockserver.core.modules.network.NetworkModule;
import org.blockserver.core.modules.player.PlayerModule;
import org.blockserver.core.modules.scheduler.SchedulerModule;

import java.util.Collection;

public class BouncyModuleLoader implements ModuleLoader {

    @Override
    public Collection<Module> setModules(Collection<Module> currentModules, Server server) {
        LoggingModule loggingModule = new LoggingModule(server);
        SchedulerModule schedulerModule = new SchedulerModule(server);
        PlayerModule playerModule = new PlayerModule(server);
        NetworkModule networkModule = new BouncyNetworkModule(server, schedulerModule);

        currentModules.add(loggingModule);
        currentModules.add(schedulerModule);
        currentModules.add(playerModule);
        currentModules.add(networkModule);

        System.out.println("[Module Loader]: Loaded " + currentModules.size() + " core modules.");

        return currentModules;
    }
}
