package com.test.closures

/**
 *
 * @author: chao.an
 * @since: 2024-08-09 15:34
 */
def writer = {
    append 'An'
    append 'Chao lives in Shanghai'
    StringBuffer stringBuffer = delegate;
    println "delegate:" + stringBuffer.toString()
}

def append(String str) {
    println "append() calles with argument: $str"
}

StringBuffer stringBuffer = new StringBuffer()
writer.delegate = stringBuffer
writer.resolveStrategy = Closure.DELEGATE_FIRST
writer()