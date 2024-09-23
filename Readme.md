Model Message: {
    id: int
    sentTime: timestmp
    from: TransferUserDto(email, name)
    to: TransferUserDto(email, name)
    text: string
    is_deleted:boolean
    replyTo: Message
}

TransferUserDto: {
    email: string
    name: string
}

ResponseMessageDTO: {
    message_id: int,
    from: TransferUserDto,
    to: TransferUserDto,
    date: timestamp,
    text: string
    replyTo: messageId(int)
}

ResultMessageDTO: {
    message: ResponseMessageDTO
}


ResponseModelDTO: {
    request_ok: bool
    result: ResultMessageDTO[]
}




