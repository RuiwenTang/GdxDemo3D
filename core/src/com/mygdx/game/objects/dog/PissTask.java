/*******************************************************************************
 * Copyright 2015 See AUTHORS file.
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/

package com.mygdx.game.objects.dog;


/**
 * A one shot animation task that makes the dog piss.
 * 
 * @author davebaol
 */
public class PissTask extends OneShotAnimationTaskBase {

	public PissTask () {
	}

	@Override
	protected TaskAnimation getTaskAnimation () {
		return TaskAnimation.Piss;
	}

}
