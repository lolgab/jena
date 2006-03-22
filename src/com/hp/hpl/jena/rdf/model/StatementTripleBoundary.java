/*
  (c) Copyright 2004, 2005, 2006 Hewlett-Packard Development Company, LP, all rights reserved.
  [See end of file]
  $Id: StatementTripleBoundary.java,v 1.3 2006-03-22 13:53:12 andy_seaborne Exp $
*/
package com.hp.hpl.jena.rdf.model;

import com.hp.hpl.jena.graph.TripleBoundary;

/**
    StatementTripleBoundary - a StatementBoundary that just wraps a
    TripleBoundary.
    
    @author kers
*/
public class StatementTripleBoundary implements StatementBoundary
    {
    protected TripleBoundary tb;
    
    /**
         Initialise this StatementTripleBoundary with the TripleBoundary <code>tb</code>.
     * @param tb
     */
    public StatementTripleBoundary( TripleBoundary tb )
        { this.tb = tb; }

    /**
         Answer whatever the triple-boundary answers for the triple of <code>s</code>.
    */
    public boolean stopAt( Statement s )
        { return tb.stopAt( s.asTriple() ); }
    
    /**
         Answer the supplied-to-constructor TripleBoundary.
    */
    public TripleBoundary asTripleBoundary( Model ignored )
        { return tb; }
    }

/*
    (c) Copyright 2004, 2005, 2006 Hewlett-Packard Development Company, LP
    All rights reserved.
    
    Redistribution and use in source and binary forms, with or without
    modification, are permitted provided that the following conditions
    are met:
    
    1. Redistributions of source code must retain the above copyright
       notice, this list of conditions and the following disclaimer.
    
    2. Redistributions in binary form must reproduce the above copyright
       notice, this list of conditions and the following disclaimer in the
       documentation and/or other materials provided with the distribution.
    
    3. The name of the author may not be used to endorse or promote products
       derived from this software without specific prior written permission.
    
    THIS SOFTWARE IS PROVIDED BY THE AUTHOR ``AS IS'' AND ANY EXPRESS OR
    IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
    OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
    IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY DIRECT, INDIRECT,
    INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
    NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
    DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
    THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
    (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
    THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/