package cn.baiyu.test.service

import cn.baiyu.test.entity.Author

/**
@author baiyu
@data 2019-10-28 14:45
 */
interface AuthorService {
    fun add(author: Author): Int
    fun update(author: Author): Int
    fun delete(id: Long): Int
    fun findAuthor(id: Long): Author?
    fun findAuthorList(): List<Author>
}