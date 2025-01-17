/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.jena.rdfxml.xmlinput;

import junit.framework.TestSuite;

public class TestPackage_xmlinput extends TestSuite
{
    static public TestSuite suite()
    {
        return new TestPackage_xmlinput() ;

    }

    private TestPackage_xmlinput()
    {
        super("RDF/XML Input") ;
        addTest( org.apache.jena.rdfxml.xmlinput.TestURIs.suite());
        addTest( org.apache.jena.rdfxml.xmlinput.TestSuiteWG_NTriples.suite());
        addTest( org.apache.jena.rdfxml.xmlinput.TestSuiteWG_RDFXML.suite());
        addTest( org.apache.jena.rdfxml.xmlinput.TestSuiteWG_RDFXML_ARP.suite());

        addTest( org.apache.jena.rdfxml.xmlinput.TestsARP.suite());
        addTest( org.apache.jena.rdfxml.xmlinput.states.TestARPStates.suite());

        addTest( org.apache.jena.rdfxml.xmlinput.TestsTainting.suite());
        addTest( org.apache.jena.rdfxml.xmlinput.TestsSAX2RDF.suite());
        addTest( org.apache.jena.rdfxml.xmlinput.TestsStAX2Model.suite());
    }

    private void addTest(String name, TestSuite tc) {
        tc.setName(name);
        addTest(tc);
    }
}
