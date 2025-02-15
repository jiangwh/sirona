/*
* Licensed to the Apache Software Foundation (ASF) under one or more
* contributor license agreements.  See the NOTICE file distributed with
* this work for additional information regarding copyright ownership.
* The ASF licenses this file to You under the Apache License, Version 2.0
* (the "License"); you may not use this file except in compliance with
* the License.  You may obtain a copy of the License at
*
*      http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package org.apache.sirona.pathtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @since 0.2
 */
public class Context
{
    private String uuid;

    private AtomicInteger level;

    private List<PathTrackingEntry> entries;

    private PathTrackingInformation startPathTrackingInformation;

    private Object startPathObject;

    public Context()
    {
        this.uuid = "Sirona-" + UUID.randomUUID().toString();
        this.level = new AtomicInteger( 0 );
        this.entries = new ArrayList<PathTrackingEntry>();
    }

    public String getUuid()
    {
        return uuid;
    }

    public AtomicInteger getLevel()
    {
        return level;
    }

    public List<PathTrackingEntry> getEntries()
    {
        return entries;
    }



    public void setUuid( String uuid )
    {
        this.uuid = uuid;
    }

    public void setLevel( AtomicInteger level )
    {
        this.level = level;
    }

    public void setEntries( List<PathTrackingEntry> entries )
    {
        this.entries = entries;
    }

    public Object getStartPathObject()
    {
        return startPathObject;
    }

    public void setStartPathObject( Object startPathObject )
    {
        this.startPathObject = startPathObject;
    }

    public PathTrackingInformation getStartPathTrackingInformation()
    {
        return startPathTrackingInformation;
    }

    public void setStartPathTrackingInformation( PathTrackingInformation startPathTrackingInformation )
    {
        this.startPathTrackingInformation = startPathTrackingInformation;
    }

}
