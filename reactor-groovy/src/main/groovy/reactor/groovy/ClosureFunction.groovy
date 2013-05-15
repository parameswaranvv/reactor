/*
 * Copyright (c) 2011-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package reactor.groovy

import groovy.transform.CompileStatic
import reactor.Fn
import reactor.core.R
import reactor.fn.Consumer
import reactor.fn.Event
import reactor.fn.Function

/**
 * @author Stephane Maldini
 */
@CompileStatic
class ClosureFunction<K,V> implements Function<K,V> {

	final Closure<V> callback

	ClosureFunction(Closure<V> cl) {
		callback = cl
	}

	@Override
	V apply(K t) {
		callback t
	}
}
