/*
 * Copyright 2015 the original author or authors.
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
 * limitations under the License
 */

/* atomix/copycat imports - RAFT library */
import io.atomix.copycat.Command;

public class SetCommand implements Command<Object> {
  private final Object key;
  private final Object value;

  public SetCommand(Object key, Object value) {
	this.key = key;
    this.value = value;
  }

  /**
   * Returns the key.
   */
  public Object key() {
    return key;
  }

  /**
   * Returns the value.
   */
  public Object value() {
    return value;
  }

  @Override
  public CompactionMode compaction() {
    return CompactionMode.QUORUM;
  }
}
